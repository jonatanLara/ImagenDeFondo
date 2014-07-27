/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package imagendefondo;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author jonatanLara
 */
public class PanelDeFondo extends JPanel {
     Image fondo;
    
    public PanelDeFondo(){
        preInit();
        initComponents();
    }
    private void initComponents() {
       
    }
    private void preInit() {
        fondo=new ImageIcon("/crayones_jpg.jpg").getImage();
    }
    @Override
    public void paint(Graphics g){
      g.drawImage(fondo, 0, 0, getWidth(), getHeight(), this);
    
    }
    
    
}
