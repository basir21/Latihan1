/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class DoWhileTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 5;

        while (x < 10) {
            System.out.println("Nilai x1 = " + x);
            x++;
        }

        //minimal dieksekusi satu kali
        do {
            System.out.println("Nilai x = " + x);
            x++;
        } while (x < 10);

        String[] names = {"James", "Larry", "Tom", "Lacy"};

        for (String name : names) {
            System.out.print(name);
            System.out.print(",");
        }
        
        char aksara = '\u1402';
        System.out.println("\u0672\uFECB\uFEAC\u0628\uFEDF\uFEEA");
    }

}
