package day12.problem2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class TextFileManager {
    private String filePath;

    public TextFileManager(String filePath) {
        this.filePath = filePath;
    }
    public void writeToFile(List<String> userInput){
        try(
                PrintWriter writer = new PrintWriter(filePath);
                ){
            System.out.println("입력이 완료되었습니다.");
            writer.println(userInput);

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public List<String> readFromFile() {
        List<String> strList = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath));
        ){

            String str;
            while ((str = reader.readLine()) != null) {
                strList.add(str);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    return strList;
    }
}
