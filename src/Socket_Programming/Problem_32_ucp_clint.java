package Socket_Programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Problem_32_ucp_clint {
    public static void main(String[] args) {
        Socket socket=null;
        try {
           socket= new Socket("Localhost",12345);
            System.out.println("Conneted to the server");

            PrintWriter out=new PrintWriter(socket.getOutputStream(),true);
            BufferedReader in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
          out.println("Hello From Clint");
          String Res=in.readLine();
            System.out.println("Receive from server "+Res);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
