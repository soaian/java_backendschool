package Self;

public class Day0424 {
    int solution(int k, int tangerine[]) {
        int count =0;
        for(int i=0; i<tangerine.length;i++){
            for(int j=0; j<tangerine.length;j++){
                if(tangerine[i] == tangerine[j]){
                    count++;
                }
            }
            System.out.println("귤의 크기가 " + tangerine[i] + "인 개수는 ");
        }

        int answer = 0;
        return answer;
    }
}
