/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitoreo2;

import javax.swing.JOptionPane;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Noel
 */
public class MainCoordinador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
            //Cambiar la implementacion del objeto por la interface
            // Hacer un metodo que se capaz de retornar el intervalo de tiempo leido desde el coordinador
            ImplIntefaceRMI objCoordinador = new ImplIntefaceRMI();
            //objCoordinador.Time = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el periodo de tiempo con el que se estara revisando"));
            Registry MyReg = LocateRegistry.createRegistry(1099);
            MyReg.rebind("miCoordinador", objCoordinador);
            JOptionPane.showMessageDialog(null, "Servidor Arrancando");
            
            
        } 
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Servidor error "+e.getMessage());
        }
        
    }
    
}
