package com.app;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RMISecurityManager;
import java.rmi.Remote;
import java.rmi.RemoteException;

import com.app.InterfaceRMI.InterfaceRMI;
import com.app.model.Phone;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws MalformedURLException, RemoteException, NotBoundException
    {
        System.setProperty("java.rmi.server.useCodebaseOnly", "false");
 
        InterfaceRMI<Phone> service = (InterfaceRMI<Phone>) Naming.lookup("//localhost/phoneController");
        System.out.println(service.get(1));
            
        
    }
}
