/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartesianproductcalculator;

import static cartesianproductcalculator.CalculatorService.combine;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @author HACKER
 */
public class CartesianCalculator extends JPanel {

    private static JLabel backgroundImageLabel;
    private static BufferedImage backgroundImage;

    /**
     * Co-ordinates Origin coordinate
     */
    private static JButton button0_0;

    /**
     * Co-ordinates For row 1 (y == 0)
     */
    private static JButton button1_0;
    private static JButton button2_0;
    private static JButton button3_0;
    private static JButton button4_0;
    private static JButton button5_0;
    private static JButton button6_0;
    private static JButton button7_0;
    private static JButton button8_0;
    private static JButton button9_0;
    private static JButton button10_0;

    /**
     * Co-ordinates For row 1 (y == 1)
     */
    private static JButton button1_1;
    private static JButton button3_1;
    private static JButton button4_1;
    private static JButton button5_1;
    private static JButton button6_1;
    private static JButton button7_1;
    private static JButton button8_1;
    private static JButton button9_1;
    private static JButton button10_1;

    /**
     * Co-ordinates For row 1 (y == 2)
     */
    private static JButton button1_2;
    private static JButton button2_2;
    private static JButton button3_2;
    private static JButton button4_2;
    private static JButton button5_2;
    private static JButton button6_2;
    private static JButton button7_2;
    private static JButton button8_2;
    private static JButton button9_2;
    private static JButton button10_2;

    /**
     * Co-ordinates For row 1 (y == 3)
     */
    private static JButton button1_3;
    private static JButton button3_3;
    private static JButton button4_3;
    private static JButton button5_3;
    private static JButton button6_3;
    private static JButton button7_3;
    private static JButton button8_3;
    private static JButton button9_3;
    private static JButton button10_3;

    /**
     * Co-ordinates For row 1 (y == 4)
     */
    private static JButton button1_4;
    private static JButton button3_4;
    private static JButton button4_4;
    private static JButton button5_4;
    private static JButton button6_4;
    private static JButton button7_4;
    private static JButton button8_4;
    private static JButton button9_4;
    private static JButton button10_4;

    /**
     * Co-ordinates For row 1 (y == 5)
     */
    private static JButton button1_5;
    private static JButton button3_5;
    private static JButton button4_5;
    private static JButton button5_5;
    private static JButton button6_5;
    private static JButton button7_5;
    private static JButton button8_5;
    private static JButton button9_5;
    private static JButton button10_5;

    /**
     * Co-ordinates For row 1 (y == 6)
     */
    private static JButton button1_6;
    private static JButton button3_6;
    private static JButton button4_6;
    private static JButton button5_6;
    private static JButton button6_6;
    private static JButton button7_6;
    private static JButton button8_6;
    private static JButton button9_6;
    private static JButton button10_6;

    /**
     * Co-ordinates For row 1 (y == -1)
     */
    private static JButton button1_n1;
    private static JButton button3_n1;
    private static JButton button4_n1;
    private static JButton button5_n1;
    private static JButton button6_n1;
    private static JButton button7_n1;
    private static JButton button8_n1;
    private static JButton button9_n1;
    private static JButton button10_n1;

    /**
     * Co-ordinates For row 1 (y == -2)
     */
    private static JButton button1_n2;
    private static JButton button3_n2;
    private static JButton button4_n2;
    private static JButton button5_n2;
    private static JButton button6_n2;
    private static JButton button7_n2;
    private static JButton button8_n2;
    private static JButton button9_n2;
    private static JButton button10_n2;

    /**
     * Co-ordinates For row 1 (y == -3)
     */
    private static JButton button1_n3;
    private static JButton button3_n3;
    private static JButton button4_n3;
    private static JButton button5_n3;
    private static JButton button6_n3;
    private static JButton button7_n3;
    private static JButton button8_n3;
    private static JButton button9_n3;
    private static JButton button10_n3;

    /**
     * Co-ordinates For row 1 (y == -5)
     */
    private static JButton button1_n5;
    private static JButton button3_n5;
    private static JButton button4_n5;
    private static JButton button5_n5;
    private static JButton button6_n5;
    private static JButton button7_n5;
    private static JButton button8_n5;
    private static JButton button9_n5;
    private static JButton button10_n5;

    /**
     * Co-ordinates For row 1 (y == -4)
     */
    private static JButton button1_n4;
    private static JButton button3_n4;
    private static JButton button4_n4;
    private static JButton button5_n4;
    private static JButton button6_n4;
    private static JButton button7_n4;
    private static JButton button8_n4;
    private static JButton button9_n4;
    private static JButton button10_n4;

    /**
     * Co-ordinates For row 1 (y == -6)
     */
    private static JButton button1_n6;
    private static JButton button3_n6;
    private static JButton button4_n6;
    private static JButton button5_n6;
    private static JButton button6_n6;
    private static JButton button7_n6;
    private static JButton button8_n6;
    private static JButton button9_n6;
    private static JButton button10_n6;

    /**
     * Co-ordinates For row 1 (x == -1)
     */
    private static JButton button_n1_n1;
    private static JButton button_n1_n2;
    private static JButton button_n1_n3;
    private static JButton button_n1_n4;
    private static JButton button_n1_n5;
    private static JButton button_n1_n6;

    /**
     * Co-ordinates For row 1 (x == -2)
     */
    private static JButton button_n2_n1;
    private static JButton button_n2_n2;
    private static JButton button_n2_n3;
    private static JButton button_n2_n4;
    private static JButton button_n2_n5;
    private static JButton button_n2_n6;

    /**
     * Co-ordinates For row 1 (x == -2)
     */
    private static JButton button_n3_n1;
    private static JButton button_n3_n2;
    private static JButton button_n3_n3;
    private static JButton button_n3_n4;
    private static JButton button_n3_n5;
    private static JButton button_n3_n6;

    /**
     * Co-ordinates For row 1 (x == -4)
     */
    private static JButton button_n4_n1;
    private static JButton button_n4_n2;
    private static JButton button_n4_n3;
    private static JButton button_n4_n4;
    private static JButton button_n4_n5;
    private static JButton button_n4_n6;

    /**
     * Co-ordinates For row 1 (x == -4)
     */
    private static JButton button_n5_n1;
    private static JButton button_n5_n2;
    private static JButton button_n5_n3;
    private static JButton button_n5_n4;
    private static JButton button_n5_n5;
    private static JButton button_n5_n6;

    private static JButton button2_1;

    private static JButton generateCartesianPrductButton;
    private static JLabel inputALabel;
    private static JLabel inputBLabel;
    private static JTextField inputAField;
    private static JTextField inputBField;
    private static JButton refreshButton;

    public static JTextArea cartesionaProductsValue;

    public CartesianCalculator() {
        setSize(1063, 700);
        setLocation(0, 0);
        setLayout(null);
        setBackground(Color.BLUE);

        refreshButton = new JButton("Refresh");
        inputAField = new JTextField();
        inputBField = new JTextField();
        inputALabel = new JLabel("Input Co-ordinate A");
        inputBLabel = new JLabel("Input Co-ordinate B");
        generateCartesianPrductButton = new JButton("Generate:");

        //origin
        button0_0 = new JButton("0,0");
        button1_0 = new JButton("1,0");
        button2_0 = new JButton("2,0");
        button3_0 = new JButton("3,0");
        button4_0 = new JButton("4,0");
        button5_0 = new JButton("5,0");
        button6_0 = new JButton("6,0");
        button7_0 = new JButton("6,0");
        button8_0 = new JButton("7,0");

        button1_1 = new JButton("1,1");
        button2_1 = new JButton("2,1");
        button2_2 = new JButton("1,2");
        button3_3 = new JButton("1,3");
        button4_4 = new JButton("1,4");
        button5_5 = new JButton("1,5");
        button6_6 = new JButton("1,5");

        button3_1 = new JButton("3,1");
        button4_1 = new JButton("4,1");
        button5_1 = new JButton("5,1");
        button6_1 = new JButton("6,1");

        button_n2_n1 = new JButton("-2,-1");
        button_n2_n2 = new JButton("-2,-2");
        button_n2_n3 = new JButton("-2,-3");
        button_n2_n4 = new JButton("-2,-4");
        button_n2_n5 = new JButton("-2,-5");
        button_n2_n6 = new JButton("-2,-6");

        button0_0.setLocation(431, 392);
        button1_0.setLocation(489, 392);
        button2_0.setLocation(547, 392);
        button3_0.setLocation(605, 392);
        button4_0.setLocation(663, 392);
        button5_0.setLocation(721, 392);
        button6_0.setLocation(779, 392);
        button7_0.setLocation(837, 392);
        button8_0.setLocation(898, 392);

        button1_1.setLocation(489, 352);
        button2_1.setLocation(547, 352);
        button3_1.setLocation(605, 352);
        button4_1.setLocation(663, 352);
        button5_1.setLocation(721, 352);
        button6_1.setLocation(779, 352);
        
        button_n2_n1.setLocation(373,312);
        button_n2_n2.setLocation(310,312);
        button_n2_n3.setLocation(248,312);
        button_n2_n4.setLocation(199,312);
        button_n2_n5.setLocation(141,312);

        List<JButton> buttons = Arrays.asList(
                button0_0, button1_0, button2_0, button3_0, button4_0, button5_0,
                button6_0, button7_0, button8_0, button1_1, button2_2, button3_3,
                button4_4, button5_5, button6_6, button1_0, button1_1, button2_1, button3_1,
                button4_1, button5_1, button6_1,button_n2_n1,button_n2_n2,
                button_n2_n3,button_n2_n4,
                button_n2_n5
        );
        setButtonProperties(buttons);

        cartesionaProductsValue = new JTextArea();
        backgroundImage = getBufferedImage("CartesianPlane.png");
        backgroundImageLabel = new JLabel(new ImageIcon(backgroundImage));
        inputALabel.setBounds(10, 10, 150, 25);
        inputBLabel.setBounds(10, 50, 150, 25);
        inputAField.setBounds(150, 10, 150, 30);
        inputBField.setBounds(150, 50, 150, 30);
        generateCartesianPrductButton.setBounds(330, 50, 100, 30);
        cartesionaProductsValue.setBounds(450, 50, 200, 30);
        refreshButton.setBounds(450, 100, 100, 25);
        backgroundImageLabel.setBounds(0, 100, 1063, 600);

        List<JLabel> labels = Arrays.asList(
                inputALabel, inputBLabel
        );

        inputALabel.setForeground(Color.WHITE);
        inputBLabel.setForeground(Color.WHITE);
        refreshButton.setBackground(Color.decode("#1e90ff"));
        refreshButton.setForeground(Color.WHITE);

        generateCartesianPrductButton.addActionListener(e -> {
            
            new ProgressbarDialog();
            
            String cordinatesA = inputAField.getText();
            String cordinateB = inputBField.getText();

            int aValueOne = new Integer(cordinatesA.substring(0, 1));
            int aValueTwo = new Integer(cordinatesA.substring(2, 3));

            int bValueOne = new Integer(cordinateB.substring(0, 1));
            int bValueTwo = new Integer(cordinateB.substring(2, 3));

            JOptionPane.showMessageDialog(null, "a" + aValueOne + " b " + aValueTwo);

            JOptionPane.showMessageDialog(null, "a" + bValueOne + " b " + bValueTwo);

            ArrayList<int[]> input = new ArrayList<>();
            input.add(new int[]{aValueOne, aValueTwo});
            input.add(new int[]{bValueOne, bValueTwo});

            combine(input, new int[input.size()], 0);
            
            

        });

        refreshButton.addActionListener(e -> {
            inputAField.setText("");
            inputBField.setText("");
        });

        add(backgroundImageLabel);
        add(inputAField);
        add(inputBField);
        add(inputALabel);
        add(inputBLabel);
        add(generateCartesianPrductButton);
        add(cartesionaProductsValue);
        add(refreshButton);
    }

    public final void setLabelProperties(List<JLabel> labels) {
        labels.stream()
                .forEach(e -> {
                    e.setForeground(Color.WHITE);
                    add(e);
                });
    }

    public final void setButtonProperties(List<JButton> buttons) {
        buttons.stream()
                .forEach(e -> {
                    e.setBackground(Color.WHITE);
                    e.setForeground(Color.WHITE);
                    e.setBorder(new LineBorder(Color.WHITE));
                    e.setSize(10, 10);
                    e.addActionListener(event -> {
                        String cordinate = e.getActionCommand();
                        if (inputAField.getText().equals("")) {
                            inputAField.setText(cordinate);
                        } else if (!inputAField.getText().equals("")) {
                            inputBField.setText(cordinate);
                        }
                    });
                    e.addMouseListener(
                            new MouseAdapter(){
                                @Override
                                public void mouseEntered(MouseEvent event){
                                    String cordinate = e.getActionCommand();
                                    e.setToolTipText(cordinate);
                                }
                                @Override
                                public void mouseExited(MouseEvent event){
                                
                                }
                            }
                    );
                    add(e);
                });
    }

    /**
     * Obtains the bufferedImage for this UI
     *
     * @param fileName String
     * @return
     */
    public final BufferedImage getBufferedImage(String fileName) {
        try {
            BufferedImage requiredImage = null;
            requiredImage = ImageIO.read(getClass().getResource("/appimages/" + fileName));
            return requiredImage;

        } catch (IOException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            return new BufferedImage(0, 0, 0);
        }
    }

}
