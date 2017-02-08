/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartesianproductcalculator;

import com.sun.scenario.effect.impl.prism.PrDrawable;
import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author HACKER
 */
public class Home extends JPanel  {
    
    private static JLabel backgroundImageLabel;
    private static BufferedImage backgroundImage;
    private static JLabel productLabel;
    
    public Home(){
        setSize(1063, 700);
        setLocation(0, 0);
        setLayout(null);
        setBackground(Color.WHITE);
        
        productLabel = new JLabel("CARTESIAN PRODUCT CALCULATOR");
        
        backgroundImage = getBufferedImage("black_hat_art_by_d4rknik0l4s_by_d4rknik0l4s-d82rzcq.jpg");
        backgroundImageLabel = new JLabel(new ImageIcon(backgroundImage));
        backgroundImageLabel.setBounds(0,0,1063,700);
        productLabel.setBounds(300,200,700,40);
        productLabel.setForeground(Color.WHITE);
        productLabel.setFont( new Font("Calibri",Font.BOLD,40));
        
        add(productLabel);
        add(backgroundImageLabel);
        
        
    }
    
    /**
     *Obtains the bufferedImage for this UI
     * @param fileName String
     * @return
     */
    public final BufferedImage getBufferedImage(String fileName){
        try {
            BufferedImage requiredImage = null;
            requiredImage = ImageIO.read(getClass().getResource("/appimages/"+fileName));
            return requiredImage;
            
        } catch (IOException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            return new BufferedImage(0, 0, 0);
        }
    }
    
    
}
