
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Hello {
    
    public static void main(String [] args){
    
        byte  a = 1; // -128, 0, 127
        short b = -32768; // -32768 ,0, 32767 
        int c = 999999;
        long d = 100000000L;
        
        float e =1.0f;
        double f = 1.0;
        
        //casting dan down casting
        c = (int) d;
        System.out.println("hasil c : " + c);
        
        a = (byte) c;
        System.out.println("hasil a : " + a);

        d = c;
        System.out.println("hasil d : " + d);
        
        b = (short) c;
        System.out.println("hasil b : " + b);
        
        char g = 'a';
        int i = (int) g;
        System.out.println("hasil char g ke i : " + i);
        
        String kata ="huruf";
        
         
    }
}
