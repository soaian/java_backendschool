package day16.problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem01 {
//    문제 1: 문자열 리스트 정렬하기
public static void main(String[] args) {
    List<String> strList = new ArrayList<>();
    strList.add("aaa");
    strList.add("bb");
    strList.add("cccc");
    strList.add("d");

    Collections.sort(strList,(a,b)->a.length()-b.length());
    System.out.println(strList);
    }
}
