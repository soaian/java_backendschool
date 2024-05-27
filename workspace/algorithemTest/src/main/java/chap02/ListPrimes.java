package chap02;
 // 2~1000 이하의 소수 찾기
public class ListPrimes {
     public static void main(String[] args) {
         int divisionCount = 0;
         for (int i = 2; i<=1000;i++){
             boolean isPrime = true;
             for (int divisor = 2; divisor<=i-1;divisor++){
                 divisionCount++;
                 if (i% divisor == 0){
                     isPrime=false;
                     break;
                 }
             }
             if (isPrime){
                 System.out.println(i);
             }
         }
         System.out.println("나눗셈 연산 횟수"+ divisionCount);
     }

}
