/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breadheart.InfoUsuario;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Mai Perez
 */
public class InfoUsuario {
    public static int getXPantalla(){
         Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
         return screenSize.width;
    }
    
    public static int getYPantalla(){
         Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
         return screenSize.height;
    }
}
