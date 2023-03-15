import java.net.*;

public class Net1 {
    public static void main(String[] args) {
        URL url = null;
        try {
            url = new URL("https://blog.openreplay.com/an-introduction-to-babel/");
            System.out.println("Host: " + url.getHost());
            System.out.println("Protocol : " + url.getProtocol());
            System.out.println("Port : " + url.getPort());
            System.out.println("Filename : " + url.getFile());
            System.out.println("Ref : " + url.getRef());
            System.out.println("Parh: " + url.getPath());
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}