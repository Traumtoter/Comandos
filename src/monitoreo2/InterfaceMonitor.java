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
public interface InterfaceMonitor extends Remote {
   
    public void PingMonitor() throws RemoteException;
    
}
