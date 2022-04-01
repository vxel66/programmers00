import java.util.Arrays;

public class 행렬의_덧셈 {

    public static void main(String [] args){
        Solution solution = new Solution();
        int[][] result1 = {{1,2},{3,4}};
        int[][] result2 = {{1,2,3},{4,5,6}};
        solution.solution(result1,2);

    }
}

class Solution {
    public int[][] solution(int[][] matrix, int r) {
        int length = matrix.length;
        int[][] answer = matrix;

        int num = 0;
        for(int n=0; n<r; n++){
            int[][]temp = answer;
            answer = new int[length][length];
            for(int j =0; j<length; j++){  //행의
                for(int x = length-1; x>-1; x--){  //열의
                    answer[j][num] = temp[x][j];
                    num++;
                }
                num = 0;
            }
        }
        System.out.println(Arrays.deepToString(answer));

        return answer;
    }
}



