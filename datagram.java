public class UDPClient{

public static void main(String[] args){

DatagramSocket client = new DatagramSocket();
InetAddress add = InetAddress.getByName("local host");
String guap = "miss the rage";
  byte [] buf = guap.getBytes();
  DatagramPacket p = new DatagramPacket(buf,buf.length, add , 4160);
  client.send(p);
}
  
  
  }
