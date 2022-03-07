public class 없는_숫자_더하기 {

        public static int solution(int[] numbers) {
            int[] sample = {1,2,3,4,5,6,7,8,9,0};
            int answer = 0;
            for(int i = 0; i<sample.length; i++){
                for(int j =0; j<numbers.length ; j++){
                    if(numbers[j]==sample[i]){
                        break;
                    }
                    if(j==numbers.length-1){
                        answer += sample[i];
                    }
                }
            }
            System.out.println(answer);
            return answer;
        }

    public static void main(String[] args) {
        int[] abc = {1,2,3,4,6,7,8,0};
        solution(abc);
    }

}
