/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.util.Random;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author youss
 */
public class Random_codes {

    public Random_codes() { Random x= new Random(5);
        try {
            PrintWriter c = new PrintWriter(new FileWriter ("random_codes.TXT"));
            for(int i=0;i<10;i++){ 
            int h;
            h=x.nextInt(0,1000000000);
            c.println(h);
        }  
        c.close();
        }
        catch (IOException ex) {
            Logger.getLogger(Random_codes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
   public static void main (String args[]){
       Random_codes r1=new Random_codes();
   }
}
