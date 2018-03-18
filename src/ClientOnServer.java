
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */

   public class ClientOnServer extends Thread{
    private Socket socket;
    private InputStreamReader isr;
    private BufferedReader br;

    public ClientOnServer(Socket socket) {
        try {
            this.socket = socket;
               System.out.println("IP: " + this.socket.getInetAddress() + "- connect ");
            this.isr = new InputStreamReader(this.socket.getInputStream());
            this.br = new BufferedReader(isr);
        } catch (IOException ex) {
            Logger.getLogger(ClientOnServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    } @Override
    public void run() {
        String tmp;
        
        while(true){
            try {
                tmp = this.br.readLine();
                if("bye".equalsIgnoreCase(tmp)){
                    break;
                }else{
                    System.out.println(this.socket.getInetAddress()+ "say" + tmp);
                }   } catch (IOException ex) {
                Logger.getLogger(ClientOnServer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

   }
    
  
