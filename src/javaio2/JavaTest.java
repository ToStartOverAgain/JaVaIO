/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaio2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class JavaTest {
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("thai.txt" ,true);
            BufferedWriter buff = new BufferedWriter(file);
            buff.write("thai");
            FileReader file2 = new FileReader("thai.txt");
            BufferedReader buff2 = new BufferedReader(file2);
            String tmp;
            while (true) {     
                tmp = buff2.readLine();
               if(tmp == null){
                   break;
               }
               
                
            }
            
            
        } catch (IOException ex) {
            Logger.getLogger(JavaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
