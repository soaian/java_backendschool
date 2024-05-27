package day04_self;

import java.util.Arrays;

// 9. 배열 요소의 이동
// String 타입의 배열 words가 있을 때, 모든 요소를 한 칸씩 오른쪽으로 이동시키는 코드를 작성하세요. 마지막 요소는 배열의 첫 번째 요소로 이동해야 합니다.
//String[] words = {"Java", "Python", "C", "JavaScript"};
//출력 예시: {"JavaScript", "Java", "Python", "C"}
public class Self9 {
    public static void main(String[] args) {
        String[] words = {"Java", "Python", "C", "JavaScript"};
        String Last = words[words.length-1];
        for (int i = words.length-1;i>0;i--){
            words[i]=words[i-1];
            System.out.println(words[i]);
        }
        words[0] = Last;
        System.out.println("==============");
        for (String word:words){
            System.out.println(word);
        }
    }
    }



//   String[] words = {"Java", "Python", "C", "JavaScript"};
//
//        String lastString = words[words.length-1];
//        for (int i = words.length-1; i > 0; i--) {
//            words[i] = words[i-1];
//        }
//        words[0] = lastString;
//
//        for (String word : words) {
//            System.out.print(word + "\t");