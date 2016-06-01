using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;
using Framework.Client.ServiceProxy;
using Framework.Service.Provider.WebService.Provider;

namespace HHT.Proxy.BargeOperation
{
    public class BargeOperationProxy : BaseServiceProxy, IBargeOperationProxy
    {
        public ResponseInfo getAll()
        {
            return this.execute("partnerInfoService", "getAll", null);
        }

        public ResponseInfo SavePartnerInfo(PartnerInfo info)
        {
            return this.execute("partnerInfoService", "save", info);
        }
    }
}