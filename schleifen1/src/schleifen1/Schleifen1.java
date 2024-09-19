    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
     */
    package schleifen1;

    /**
     *
     * @author Tim
     */
    public class Schleifen1 {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            int random;
    do {
        random = (int)(Math.random() * (9999 - 999+1)+999);
        System.out.println(random);
    } while (random < 9000);
    

    }  

    }
