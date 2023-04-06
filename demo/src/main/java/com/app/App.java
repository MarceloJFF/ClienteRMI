package com.app;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RMISecurityManager;
import java.rmi.Remote;
import java.rmi.RemoteException;

import com.app.InterfaceRMI.InterfaceRMI;
import com.app.model.User;
import com.app.model.Contact;
import com.app.model.Phone;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
      

        try {
        
            InterfaceRMI<Phone> servicePhone = (InterfaceRMI<Phone>)
            Naming.lookup("rmi://localhost/phoneController");
            Phone p = servicePhone.get(1);
            InterfaceRMI<Contact> serviceContact = (InterfaceRMI<Contact>) Naming.lookup("rmi://localhost/contactController");
            Contact c = serviceContact.get(1);
            System.out.println(c.getName());

        } catch (Exception e) {
            System.out.println(e.getMessage());
            // TODO: handle exception
        }

    }
}
