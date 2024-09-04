package Practice;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args) {
        try {
            ServerSocket ssocket=new ServerSocket(2222);
            System.out.println("Server Connected ");
            Socket socket=ssocket.accept();
            System.out.println("Clint connected ");
            ObjectInputStream ois=new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream oos=new ObjectOutputStream(socket.getOutputStream());


            try {
                Object cmsg=ois.readObject();
                System.out.println("FRom clint " +(String) cmsg);
                String str=(String) cmsg;
                str=str.toUpperCase();
                oos.writeObject(str);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
