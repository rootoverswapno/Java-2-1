package Socket_Programming;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args) throws IOException {
        ServerSocket serversocket = new ServerSocket(2222);
        System.out.println("Server Connected");
        while (true) {
            Socket socket = serversocket.accept();
            System.out.println("Clint Connected");
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream ous = new ObjectOutputStream(socket.getOutputStream());

            try {
                Object cmsg = ois.readObject();
                System.out.println("From Clint " + (String) cmsg);
                String str = (String) cmsg;
                str = str.toUpperCase();
                ous.writeObject(str);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }


        }
    }
}
