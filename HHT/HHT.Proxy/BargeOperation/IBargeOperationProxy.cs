using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;
using Framework.Service.Provider.WebService.Provider;

namespace HHT.Proxy.BargeOperation
{
    public interface IBargeOperationProxy
    {
        ResponseInfo getAll();
    }
}
