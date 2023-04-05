package com.app.InterfaceRMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceRMI<T>  extends Remote{
    public boolean salvar(T t) throws RemoteException;
    public boolean excluir(T t) throws RemoteException;
    public T get(Integer id)throws RemoteException;
}
