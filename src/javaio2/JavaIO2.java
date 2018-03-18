/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaio2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author daolinh
 */
public class JavaIO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // try with resource
        try (FileWriter fw = new FileWriter("test.txt", true);
                BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("Hello JAVA io\n");
        FileReader fr = new FileReader("test.txt");
        BufferedReader br = new BufferedReader(fr);
        String tmp;
        while (true) {
            tmp = br.readLine();
            if (tmp == null) {
                break;
            }

            System.out.println(tmp);
            String[] lineSplit = tmp.split("\\|");
            for (int i = 0; i < lineSplit.length; i++) {
                System.out.println(i + "-" + lineSplit[i].trim() + "-");
            }
            break;
        }
        } catch (IOException ex) {
            Logger.getLogger(JavaIO2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
