/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Admin
 */
public class Sever {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(6666);
        System.out.println("Sever started ,listening to port 6666.");  
        while(true){
             Socket socket = server.accept();
             System.out.println("IP:"+ socket.getInetAddress() + "-connect-");
        InputStreamReader isr = new InputStreamReader(socket.getInputStream());
        BufferedReader br = new BufferedReader(isr);
        String tmp;
        
       
        while(true){
            tmp = br.readLine();
            if(tmp != null){
                if (tmp.equalsIgnoreCase("bye")){
                    break;
                }else{
                    System.out.println("tmp");
                }
                
            }
        }
    }
}
}