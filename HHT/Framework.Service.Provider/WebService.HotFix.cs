using System;
using System.Collections.Generic;
using System.Text;

namespace Framework.Service.Provider.WebService.Provider
{
    partial class WSFacadeService
    {
        public WSFacadeService(string serviceUrl)
            : this()
        {
            this.Url = serviceUrl;
        }
    }
}
