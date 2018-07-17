/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Mai Perez
 */
public class PantallaInicio extends JPanel{
    
    public int WIDTH = 800;
    public int HEIGHT = 600;
    private JLabel Background = new JLabel();
    
    
    public PantallaInicio(){
        
        Background.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Background_Inicio.jpg")));
        Background.setBounds(0,0, WIDTH, HEIGHT);

        setLayout(null);
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        validate();
        
        add(Background);
    }
}
