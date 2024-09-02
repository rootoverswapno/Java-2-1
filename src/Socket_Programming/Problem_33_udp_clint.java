package Socket_Programming;

import java.io.IOException;
import java.net.*;

public class Problem_33_udp_clint {
    public static void main(String[] args) {
        try {
            DatagramSocket clintsocket=new DatagramSocket();
            InetAddress serveraddress=InetAddress.getByName("loaclhost");
            byte[]sendData="Hello Udp Server".getBytes();
            // Send the message to the server
            DatagramPacket sendpacket=new DatagramPacket(sendData, sendData.length,serveraddress,9876);
            clintsocket.send(sendpacket);
        } catch (SocketException e) {
            throw new RuntimeException(e);
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
