import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class ClientChat {

    
public static void main(String[] args) throws IOException {
      Socket socket = new Socket("10.22.184.236", 6666);
        System.out.println("Kết nối thành công đến server...");

        OutputStreamWriter osw = new OutputStreamWriter(socket.getOutputStream());
        BufferedWriter bw = new BufferedWriter(osw);
        System.out.println("Enter something to chat or 'bye' to stop.");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String text = scanner.nextLine();
            System.out.println("Sending text: '" + text + "'");
            bw.write(text);
            bw.newLine();
            bw.flush();
            if (text.equalsIgnoreCase("bye")) {
                break;
            }
        }
}
}
//        Socket socket = new Socket("10.22.184.92", 6666);
//        System.out.println("Kết nối thành công đến server...");
//
//        OutputStreamWriter osw = new OutputStreamWriter(socket.getOutputStream());
//        BufferedWriter bw = new BufferedWriter(osw);
//        System.out.println("Enter something to chat or 'bye' to stop.");
//
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            String text = scanner.nextLine();
//            System.out.println("Sending text: '" + text + "'");
//            bw.write(text);
//            bw.newLine();
//            bw.flush();
//            if (text.equalsIgnoreCase("bye")) {
//                break;
//            }
//        }
//            }
        
    
    