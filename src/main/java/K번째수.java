import java.util.Arrays;

public class K번째수 {

//    예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면
//
//    array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
//    1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
//    2에서 나온 배열의 3번째 숫자는 5입니다.

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i =0; i<commands.length; i++){
            int[] sample = new int[commands[i][1]-commands[i][0]+1];
            for(int j = commands[i][0]-1; j<commands[i][1]; j++){
                for(int x = 0; x<sample.length; x++){
                    if(sample[x]==0){
                        sample[x] = array[j];
                        break;
                    }
                }
            }
            for(int a=0; a<sample.length; a++) {
                for(int j=a+1; j<sample.length; j++) {
                    if(sample[a] > sample[j]) {
                        int tmp = sample[a];
                        sample[a] = sample[j];
                        sample[j] = tmp;
                    }
                }
            }
            for(int b=0; b<answer.length; b++){
                if(answer[b]==0){
                    answer[b] = sample[commands[i][2]-1];
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] a = {1, 5, 2, 6, 3, 7, 4};
        int[][] b = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        int[] result = solution(a,b);
        System.out.println(Arrays.toString(result));
    }

}
