package day10;

public class ScoreException extends Exception{
    public ScoreException(int score){
        System.out.println("0-100사이의 숫자만 입력이 가능합니다.");
        System.out.println("현재 입력한 점수 : " + score);
    }
}
