/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package schleifen2;

/**
 *
 * @author Tim
 */
public class Schleifen2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dice = 0;
        for (int i = 0; i < 1000;++i) {
            dice = (int)(Math.random() * 6) + 1;
            System.out.println(dice);
        }
    }
    
}
