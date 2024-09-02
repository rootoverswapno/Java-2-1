package Socket_Programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Problem_32_ucp_server {
    public static void main(String[] args) {
        ServerSocket serverSocket=null;
        Socket clintsocket=null;
        try {
            serverSocket=new ServerSocket(12345);
            System.out.println("Server connected");
            clintsocket=serverSocket.accept();
            System.out.println("Clint Connected");
            BufferedReader in=new BufferedReader(new InputStreamReader(clintsocket.getInputStream()));
            PrintWriter out=new PrintWriter(clintsocket.getOutputStream(),true);
            String cmsg=in.readLine();
            System.out.println("Receive form clint "+(String) cmsg);
            out.println("hello form server");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
