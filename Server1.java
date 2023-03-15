import java.net.*;
import java.io.*;

public class Server1 {
    public static void main(String[] args) {

        Socket socket = null;
        InputStreamReader inputStreamReader = null;
        OutputStreamWriter outputStreamWriter = null;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        ServerSocket serverSocket = null;

        try {
            serverSocket = new ServerSocket(1234);
            String msg;

            while (true) {
                socket = serverSocket.accept();

                inputStreamReader = new InputStreamReader(socket.getInputStream());
                outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());

                bufferedReader = new BufferedReader(inputStreamReader);
                bufferedWriter = new BufferedWriter(outputStreamWriter);

                while (true) {
                    msg = bufferedReader.readLine();
                    System.out.println("From Client :" + msg);

                    bufferedWriter.write("MSG Received");
                    bufferedWriter.newLine();
                    bufferedWriter.flush();
                    if (msg.equalsIgnoreCase("BYE"))
                        break;
                }
                if (msg.equalsIgnoreCase("BYE"))
                    break;
            }
        } catch (Exception e) {
            // TODO: handle exception
        } finally {
            try {
                inputStreamReader.close();
                outputStreamWriter.close();
                bufferedReader.close();
                bufferedWriter.close();
                socket.close();
                serverSocket.close();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }

    }
}
