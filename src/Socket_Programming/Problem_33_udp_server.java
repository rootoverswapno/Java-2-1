package Socket_Programming;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Problem_33_udp_server {
    public static void main(String[] args) {
        try {
            DatagramSocket serversocket=new DatagramSocket(9876);
            byte[]receive=new byte[1024];
            System.out.println("Server is listening on port 9876...");
            DatagramPacket receivepacket=new DatagramPacket(receive, receive.length);
            try {
                serversocket.receive(receivepacket);
                String clintmsg=new String(receivepacket.getData(),0,receivepacket.getLength());
                System.out.println("Receive from clint " +clintmsg);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (SocketException e) {
            throw new RuntimeException(e);
        }
    }
}
