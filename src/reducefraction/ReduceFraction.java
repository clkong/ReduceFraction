/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reducefraction;

import javax.swing.JOptionPane;

/**
 *
 * @author toluo7449
 */
public class ReduceFraction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String number = JOptionPane.showInputDialog("Please enter the numberator"
                + " for your fraction.");
        int r = Integer.parseInt(number);
        // r and number represent the numberator in one fraction
        String number1 = JOptionPane.showInputDialog("Please enter the denominator"
                + " for your fraction");
        int m = Integer.parseInt(number1);
        // number1 and m represent the denominator in one fraction
        int ans = gcd(m,r);
        int a,b;
        a = r/ans;
        b = m/ans;
        //a and b reprensent the numberator and denominator are reduced.
        System.out.println("The frection "+r+"/"+m+" can be reduced to : "+
                a+"/"+b);
    }
        
        
     public static int gcd(int a, int b){
    if(b == 0) {
      return a;
    }
    else {
      //% is modulus, also known as the remainder function
      return gcd(b, a%b);
    }
  }
}
