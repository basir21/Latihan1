/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Latihan2 {

    public static void main(String[] args) {

        int bilGanjil = 0;
        int bilanganGenap = 0;
        int x = 0;
        //0 - 100
        
        for ( ;x < 10; x++) {
            if (x % 2 == 0) {
                bilanganGenap += x;

            } else {
                bilGanjil += x;
            }

        }
        System.out.println("Hasil Penjummlahan Genap : " + bilanganGenap);
        System.out.println("Hasil Penjumlahan Ganjil : " + bilGanjil);

        switch(bilGanjil){
            case 20:
                System.out.println(bilGanjil);
                break;
            case 25:
                System.out.println(bilGanjil);
                break;
            
            default: System.out.println(bilanganGenap);
            
    }
    }
}
