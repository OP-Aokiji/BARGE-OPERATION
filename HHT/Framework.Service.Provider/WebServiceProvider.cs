
using System;
using System.Collections.Generic;
using System.Text;
using System.Collections;
using Framework.Service.Provider.WebService.Provider;
using Framework.Common.Exception;
using Framework.Service.Provider.Config;

namespace Framework.Service.Provider
{
    public class WebServiceProvider : IServiceProvider
    {
        private WSFacadeService service;
        private Hashtable serviceCache;
        private const String proxyConstant = "proxy";

        public WebServiceProvider(){}
        
        public ResponseInfo execute(RequestInfo info)
        {
            //System.Net.ServicePointManager.CertificatePolicy = new SSLPolicy();  //Add because of SSL

            ResponseInfo returnInfo = null;

            if (serviceCache == null)
            {
                serviceCache = new Hashtable();
            }

            try
            {
                if (serviceCache.ContainsKey(proxyConstant))
                {
                    service = (WSFacadeService)serviceCache[proxyConstant];
                }
                else
                {
                    IConfig config = new Framework.Service.Provider.Config.Config();
                    String serviceProvider = config.getServierProvider();
                    service = new WSFacadeService(serviceProvider);
                    serviceCache.Add(proxyConstant, service);
                }

                returnInfo = service.execute(info);

            }
            catch (BusinessException ex)
            {
                throw ex;
            }
            catch (ServiceException sex)
            {
                throw sex;
            }
            catch (Exception e)
            {
                throw new ServiceException("The HHT Client couldn't connect to the Webservice", e);
            }
            return returnInfo;
        }


        #region IServiceProvider Members

        #endregion
    }
}
