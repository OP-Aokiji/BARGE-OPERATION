using System;
using System.Collections.Generic;
using System.Text;
using NUnit.Framework;
using Framework.Service.Provider.WebService.Provider;
using System.Collections;
using System.Windows.Forms;
using HHT.GUI;

namespace HHT.NUnit
{
    [TestFixture]
    public class Program : AssertionHelper
    {
        [Test]
        public void MainMethod()
        {
            Application.Run(new PtnrInfo());
        }
    }
}
