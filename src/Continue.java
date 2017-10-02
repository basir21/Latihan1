/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Continue {

    public static void main(String[] args) {

        int x = 0;
        int i = 0;
        for (i = 0; i < 5; i++) {
            if (i == 3) {
                continue;
            }
            x += i;

        }
        System.out.println(x);

        while (i < 5) {
            System.out.println(i);
            i++;
            
        }
        
    }
}
