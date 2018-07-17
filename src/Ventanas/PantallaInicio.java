/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Mai Perez
 */
public class PantallaInicio extends JPanel{
    
    public int WIDTH = 800;
    public int HEIGHT = 600;
    static JButton White = new JButton("Black!");
    
    
    public PantallaInicio(){
        
        
        add(White);
        setBackground(Color.black);
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        validate();
    }
}
