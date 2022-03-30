import java.util.Arrays;

public class 나누어_떨어지기 {

    public static void main(String[] args) {
        나누어_떨어지기 나누어_떨어지기 = new 나누어_떨어지기();
        int [] abc = {5,9,7,10};
        int[] answer = 나누어_떨어지기.solution(abc,5);
        System.out.println(Arrays.toString(answer));
    }

    public int[] solution(int[] arr, int divisor) {
        int length = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0) length++;
        }

        int[] answer = new int[length];

        if(length==0){
            answer = new int[1];
            answer[0]=-1;
            return answer;
        }

        for(int i =0; i<arr.length; i++){
            if(arr[i]%divisor==0){
                for(int j =0; j<answer.length;j++){
                    System.out.println(j);
                    if(answer[j]==0){
                        answer[j]=arr[i];
                        break;
                    }
                }
            }
        }

        Arrays.sort(answer);
        return answer;
    }

}
