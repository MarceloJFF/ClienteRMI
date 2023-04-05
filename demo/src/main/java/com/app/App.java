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

            System.setProperty("java.rmi.server.useCodebaseOnly", "false");
            // InterfaceRMI<Contact> serviceContact = (InterfaceRMI<Contact>)
            // Naming.lookup("//localhost/contactController");
            // Contact contact = new Contact();
            // System.out.println(serviceContact.get(2));
            // System.out.println(contact.getName())
            // InterfaceRMI<Phone> servicePhone = (InterfaceRMI<Phone>)
            // Naming.lookup("//localhost/phoneController");
            InterfaceRMI<User> serviceUser = (InterfaceRMI<User>) Naming.lookup("//localhost/userController");

            serviceUser.get(1);

            // p.setContact(contact);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            // TODO: handle exception
        }

    }
}
