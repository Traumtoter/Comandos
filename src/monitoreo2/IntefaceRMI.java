/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitoreo2;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Noel
 */
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
public interface IntefaceRMI extends Remote{
    
    public void iniMonitor(String Monitor)throws RemoteException;
    public void loadMonitor(String Fichero,String Ip)throws RemoteException;
    public int iniClient()throws RemoteException;
    public ArrayList<String> getLoadAvg()throws RemoteException;
    public int ReturnTime() throws RemoteException;
}
