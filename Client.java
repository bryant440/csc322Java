
import java.io.*;
import java.net.*;
import java.util.*;

class Client {
    public static void main(String[] args) {
        Socket s = null;
        InputStreamReader in = null;
        OutputStreamWriter out = null;
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            s = new Socket("localhost", 1234);
            in = new InputStreamReader(s.getInputStream());
            out = new OutputStreamWriter(s.getOutputStream());

            br = new BufferedReader(in);
            bw = new BufferedWriter(out);

            while (true) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter Msg :");
                String msg = scanner.nextLine();
                bw.write(msg);
                bw.newLine();
                bw.flush();
                System.out.println("From Server :" + br.readLine());
                if (msg.equalsIgnoreCase("BYE"))
                    break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (s != null)
                    s.close();
                if (br != null)
                    br.close();
                if (bw != null)
                    bw.close();
                if (in != null)
                    in.close();
                if (out != null)
                    out.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
