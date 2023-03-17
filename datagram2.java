import java.net.*;
import java.io.*;
public class UDPServer{
public static void main(String[] args) throws IOException{
DatagramSocket server = new DatagramSocket(4120);
byte [] buf = new byte[256];
DatagramPacket packet = new DatagramPacket(buf,buf.length);
 server.receive(packet);
  String response = new String(packet.getData());
  System.out.println("response" + response)
   server.close();
}
}
