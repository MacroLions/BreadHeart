/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breadheart;

import Ventanas.PantallaInicio;
import breadheart.InfoUsuario.InfoUsuario;
import javax.swing.JFrame;

/**
 *
 * @author Mai Perez
 */
public class BreadHeart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame Ventana = new JFrame();
        
        Ventana.setContentPane(new PantallaInicio());
        Ventana.pack();
        Ventana.setVisible(true);
        Ventana.setResizable(false);
        
        Ventana.setLocation(InfoUsuario.getXPantalla()/4,InfoUsuario.getYPantalla()/6);
       
        Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
