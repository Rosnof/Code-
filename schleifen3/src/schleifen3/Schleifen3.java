/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package schleifen3;

/**
 *
 * @author Tim
 */
public class Schleifen3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum1 = 5;
        int sum2 = 7;
        int sum;
   do {  
        sum1 +=(int)(Math.random()* 100)+1;
        sum2 += (int)(Math.random()* 100)+1;
        sum = sum1 + sum2;
    } while(sum < 100);   
   System.out.println(sum);
   System.out.println(sum1+" "+sum2);
   
}

}