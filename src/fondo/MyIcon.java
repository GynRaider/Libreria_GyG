/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fondo;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.Icon;


/**
 *
 * @author Mchael
 */
public class MyIcon {
    public void paintIcon(Component c, Graphics g, int x, int y) {
        
        Image image = new ImageIcon(getClass().getResource("recursos/pencil.png")).getImage();
        g.drawImage(image, x, y, c);
    }
    public int getIconWidth() {
        return 50;
    }
    public int getIconHeight() {
        return 50;
    }
}
