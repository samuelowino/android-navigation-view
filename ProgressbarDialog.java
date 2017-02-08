/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartesianproductcalculator;

import java.awt.Color;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;

/**
 *
 * @author HACKER
 */
public class ProgressbarDialog extends JDialog {

    private static JProgressBar progressBar;
    private static JLabel inprogressLabel;
    private static int progressCounter = 0;
    private static JLabel bgImage;
    private static BufferedImage bufferedImage;

    public ProgressbarDialog() {
        setSize(600, 130);
        setLocation(200, 200);
        setLayout(null);
        setBackground(Color.WHITE);

        progressBar = new JProgressBar();
        progressBar.setBounds(20, 30, 500, 30);
        progressBar.setMinimum(0);
        progressBar.setMaximum(100);
        progressBar.setStringPainted(true);
        bgImage = new JLabel(new ImageIcon());

        bufferedImage = getBufferedImage("black_hat_art_by_d4rknik0l4s_by_d4rknik0l4s-d82rzcq.jpg");
        bgImage = new JLabel(new ImageIcon(bufferedImage));
        
        inprogressLabel = new JLabel("Analyzing cordinates...");

        inprogressLabel.setBounds(20, 3, 400, 25);
        bgImage.setBounds(0,0,600,130);

        add(progressBar);
        add(inprogressLabel);
        add(bgImage);

        repaint();
        setVisible(true);

        new Thread(
                () -> {
                    while (progressCounter <= 100) {
                        SwingUtilities.invokeLater(() -> {
                            progressBar.setValue(progressCounter++);
                            //control progressbar
                            if (progressCounter == 30) {
                                inprogressLabel.setText("Carrying out algorithm build...");

                            } else if (progressCounter == 60) {
                                inprogressLabel.setText("Completing analysis cycles...");
                            } else if (progressCounter == 80) {
                                inprogressLabel.setText("Cordinates  build in progress...");
                            } else if (progressCounter == 80) {
                                inprogressLabel.setText("On completion stage...");
                            } else if (progressCounter == 90) {
                                inprogressLabel.setText("Runninf final cycle...");
                            } else if (progressCounter == 95) {
                                inprogressLabel.setText("Almost done...");
                            } else if (progressCounter == 97) {
                                inprogressLabel.setText("Completing verification...");
                            }
                            if (progressCounter == 100) {

                                inprogressLabel.setText("Algorithm  completed succefully...");
                                progressBar.setValue(0);
                            }

                        });

                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException ex) {
                        }
                    }

                }).start();
    }

    public final BufferedImage getBufferedImage(String fileName) {
        try {
            BufferedImage bufferedImage = null;
            bufferedImage = ImageIO.read(getClass().getResource("/appimages/"+fileName));
            return bufferedImage;
        } catch (Exception e) {
            return new BufferedImage(0,0,0);
        }
    }

}
