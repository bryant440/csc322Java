import java.io.*;
import java.net.*;
import java.util.*;

class Server {
    public static void main(String[] args) {
        Socket s = null;
        InputStreamReader in = null;
        OutputStreamWriter out = null;
        BufferedReader br = null;
        BufferedWriter bw = null;
        ServerSocket ss = null;

        String msg = null;
        try {
            ss = new ServerSocket(1234);

            while (true) {
                try {
                    s = ss.accept();
                    in = new InputStreamReader(s.getInputStream());
                    out = new OutputStreamWriter(s.getOutputStream());

                    br = new BufferedReader(in);
                    bw = new BufferedWriter(out);

                    while (true) {
                        msg = br.readLine();
                        System.out.println("From Client :" + msg);
                        bw.write("MSG Received By Server");
                        bw.newLine();
                        bw.flush();
                        if (msg.equalsIgnoreCase("BYE"))
                            break;
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }

                if (msg.equalsIgnoreCase("BYE"))
                    break;

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                s.close();
                ss.close();
                br.close();
                bw.close();
                in.close();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}