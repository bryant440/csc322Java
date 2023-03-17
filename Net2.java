import java.io.BufferedReader;
import java.io.*;
import java.net.*;
//READS COONTENTS OF A URL
public class Net2 {
    public static void main(String[] args) {
        URL url = null;

        try {
            url = new URL("https://blog.openreplay.com/an-introduction-to-babel/");

            BufferedReader bf = new BufferedReader(new InputStreamReader(url.openStream()));//Buffer-input-openStream
            String msg;
            while ((msg = bf.readLine()) != null)
                System.out.println(msg);
            bf.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}/*
BufferedReader bf = new BufferedReader(new InputStreamReader(url.openStream()));
String guap;
while((guap = bf.readline()) != null){

System.out.println(guap);
    bf.close();*/
    
    }
