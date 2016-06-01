using System;
using System.Collections.Generic;
using System.Text;
using Framework.Service.Provider.WebService.Provider;
using System.Collections;

namespace Framework.Client.ServiceProxy
{
    public class BaseServiceProxy
    {
        public BaseServiceProxy() { }

        internal ServiceDelegate ServiceDelegate
        {
            get
            {
                throw new System.NotImplementedException();
            }
            set
            {
            }
        }

        public ResponseInfo execute(String serviceID, String methodName, object parm)
        {
            ResponseInfo returnInfo;
            try
            {
                object[] obj = null;
                obj = new object[] { parm };
                returnInfo = new ServiceDelegate().execute(serviceID, methodName, obj);
            }
            catch (Framework.Common.Exception.BusinessException ex)
            {
                throw ex;
            }
            return returnInfo;
        }
    }
}