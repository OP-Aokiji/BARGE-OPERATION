using System;
using System.Collections.Generic;
using System.Windows.Forms;
using System.Threading;
using System.Runtime.InteropServices;

namespace HHT.GUI
{
    static class Program
    {
        private const int ERROR_ALREADY_EXISTS = 183;
        [MTAThread]
        static void Main()
        {
            bool bCreated = false;
            string appName = "HHT.GUI";
            if (CreateMutex(IntPtr.Zero, true, appName) != 0)
            {
                if (GetLastError() == ERROR_ALREADY_EXISTS)
                {
                    bCreated = true;
                }
            }

            if (!bCreated)
            {
                Application.Run(new PtnrInfo());
            }
        }

        [DllImport("CoreDll.dll")]
        private static extern int GetLastError();

        [DllImport("CoreDll.dll", EntryPoint = "CreateMutexW")]
        private static extern int CreateMutex(IntPtr lpMutexAttributes, bool InitialOwner, string MutexName);
    }
}