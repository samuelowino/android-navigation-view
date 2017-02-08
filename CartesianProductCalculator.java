/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartesianproductcalculator;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author HACKER
 */
public class CartesianProductCalculator extends JFrame {
    
    private static JTabbedPane tabbedPane;
    
    public CartesianProductCalculator(){
        /**
         * Set Frame Properties
         */
        setSize(1063, 700);
        setLocation(0, 0);
        setLayout(null);
        setBackground(Color.BLACK);
        
        setTitle("Cartesian Calculator");
        
        tabbedPane = new JTabbedPane();
        tabbedPane.setBackground(Color.BLACK);
        tabbedPane.setForeground(Color.RED);
        tabbedPane.setBounds(0,0,1063,700);
        
        tabbedPane.add("Home" , new Home());
        tabbedPane.add("Catesian Calculator", new CartesianCalculator());
        
        add(tabbedPane);
        
        repaint();
        setVisible(true);
    }

    public static void main(String[] args) {
      javax.swing.SwingUtilities.invokeLater(
              new Runnable(){
                  @Override
                  public void run(){
                      new CartesianProductCalculator();
                  }
              }
      );
    }
    
}
