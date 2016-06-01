using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;
using Framework.Service.Provider.WebService.Provider;
using HHT.Proxy.BargeOperation;


namespace HHT.GUI
{
    public partial class PtnrInfo : Form
    {
        private const string HEADER_CODE = "CODE";
        private const string HEADER_NAME = "NAME";
        private const string HEADER_DATE = "CREATE DATE";

        public PtnrInfo()
        {
            InitializeComponent();
        }

        private void ButtonSearchClick(object sender, EventArgs e)
        {
            //PartnerInfo parm = new PartnerInfo();
            BargeOperationProxy proxy = new BargeOperationProxy();

            ResponseInfo result = proxy.getAll();

            DataTable dtResult = new DataTable();

            dtResult.Columns.Add(HEADER_CODE);
            dtResult.Columns.Add(HEADER_NAME);
            dtResult.Columns.Add(HEADER_DATE);

            for (int i = 0; i < result.resultObj.Length; i++)
            {
                if (result.resultObj[i] is PartnerInfo)
                {
                    PartnerInfo info = (PartnerInfo)result.resultObj[i];
                    DataRow newRow = dtResult.NewRow();
                    newRow[HEADER_CODE] = info.code;
                    newRow[HEADER_NAME] = info.name;
                    newRow[HEADER_DATE] = info.createdDate;
                    dtResult.Rows.Add(newRow);
                }
            }

            grvData.DataSource = dtResult;
        }

        private void btnAdd_Click(object sender, EventArgs e)
        {
            if (txtCode.Text != null && txtName != null)
            {
                PartnerInfo info = new PartnerInfo();
                info.code = txtCode.Text;
                info.name = txtName.Text;
                info.createdDate = System.DateTime.Now.ToString("dd-MM-yyyy HH:mm:ss");
                BargeOperationProxy proxy = new BargeOperationProxy();

                ResponseInfo result = proxy.SavePartnerInfo(info);

                MessageBox.Show("Save Success");

                txtCode.Text = "";
                txtName.Text = "";
            }       
        }
    }
}