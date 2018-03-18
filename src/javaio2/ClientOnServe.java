/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaio2;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 *
 * @author Admin
 */
public class ClientOnServe extends Thread{
    private Socket socket;
    private InputStreamReader isr;
    private BufferedReader br;

    public ClientOnServe(Socket socket) {
        try {
            this.socket = socket;
               System.out.println("IP: " + this.socket.getInetAddress() + "- connect ");
            this.isr = new InputStreamReader(this.socket.getInputStream());
            this.br = new BufferedReader(isr);
        } catch (IOException ex) {
            Logger.getLogger(ClientOnServe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void run() {
        String tmp;
        
        while(true){
            try {
                tmp = this.br.readLine();
                if("bye".equalsIgnoreCase(tmp)){
                    break;
                }else{
                    System.out.println(tmp);
                }   } catch (IOException ex) {
                Logger.getLogger(ClientOnServe.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

