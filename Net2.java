import java.io.BufferedReader;
import java.io.*;
import java.net.*;

public class Net2 {
    public static void main(String[] args) {
        URL url = null;

        try {
            url = new URL("https://blog.openreplay.com/an-introduction-to-babel/");

            BufferedReader bf = new BufferedReader(new InputStreamReader(url.openStream()));
            String msg;
            while ((msg = bf.readLine()) != null)
                System.out.println(msg);
            bf.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
