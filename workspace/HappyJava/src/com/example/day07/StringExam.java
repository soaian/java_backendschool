package com.example.day07;

public class StringExam {
    public static void main(String[] args) {
        String str1 = "hello"; //같은 주소의 스트링 가짐
        String str2 = "hello";  //같은 주소의 스트링 가짐
        String str3 = new String("hello");  //new 이기때문에 새로운 주소값이 형성
        String str4 = new String("hello");

        if(str1 == str2){
            System.out.println("같아요");
        }
        else{
            System.out.println("달라요");
        }
        System.out.println("====================");

        if(str3 == str4){
            System.out.println("같아요");
        }
        else{
            System.out.println("달라요");
        }

        System.out.println(str1.concat(" java")); //string은 추가로 뭔가 붙이게되면 그때 새로운 주소값이 생성됨
        System.out.println(str1); //변하지 않음 -> 불변객체

        //final ->class앞에 붙이면 상속이 안되는것. 즉, 오버라이딩 할 수 없음

    }
}
