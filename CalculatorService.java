/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartesianproductcalculator;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author HACKER
 */
public class CalculatorService {

    /* public static void main(String[] args) {
    ArrayList<int[]> input = new ArrayList<>();
    input.add( new int[] {1,2});
    input.add( new int[] {3,4});
    
    combine(input, new int[input.size()],0);
    
    }*/
    protected static void combine(ArrayList<int[]> input, int[] current, int k) {
         CartesianCalculator.cartesionaProductsValue.append("(");
        if (k == input.size()) {

            for (int i = 0; i < k; i++) {
                //System.out.println(current[i]+" ");
                //JOptionPane.showMessageDialog(null, "Cartesian Product =>" + current[i]);
               
                CartesianCalculator.cartesionaProductsValue.append(new Integer(current[i]).toString());

            }
            CartesianCalculator.cartesionaProductsValue.append("),(");
        } else {
            for (int j = 0; j < input.get(k).length; j++) {
                current[k] = input.get(k)[j];
                combine(input, current, k + 1);
            }
        }

    }
}
