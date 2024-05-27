package day12;

import day11.Pen;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class WWWRead {
    public static void main(String[] args) throws Exception{
     URL url = new URL("https://techit.education/");
     InputStream urlInput = url.openStream();
     BufferedReader br = new BufferedReader(new InputStreamReader(urlInput));
     String msg = null;
     while ((msg = br.readLine()) != null){
         System.out.println(msg);
     }
        System.out.println(msg);
    }
}
