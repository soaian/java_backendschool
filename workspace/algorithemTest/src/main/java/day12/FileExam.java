package day12;

import java.io.File;

public class FileExam {
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir")); //밑의 .과 같은의미
        File dir = new File("."); //.은 현재 디렉토리를 의미함.
        String[] files = dir.list();
        for (String str : files){
            System.out.println(str);
        }
    }
}
