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
            System.out.println("Path: " + url.getPath());
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
/*
url.getHost() returns the host name of the URL ("blog.openreplay.com" in this case).
url.getProtocol() returns the protocol of the URL ("https" in this case).
url.getPort() returns the port number of the URL (-1 because it is not specified in this case).
url.getFile() returns the file name of the URL ("/an-introduction-to-babel/" in this case).
url.getRef() returns the reference of the URL (null because it is not specified in this case).
url.getPath() returns the path of the URL ("/an-introduction-to-babel/" in this case).

public class Main{
public static void main(String[] args){
URL url = null
try{
System.out.println("path:" + url.getPath());
}
catch(Exception e){
e.printStackTrace();
}
}
}
*/
