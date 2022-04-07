public class 하샤드_수 {

    public static void main(String[] args) {
        int abc = 11;
        System.out.println(solution(abc));
    }

    public static boolean solution(int x) {
        boolean answer = true;
        int a = 0;
        String b =String.valueOf(x);
        for(int i = 0; i < b.length(); i++) {
            a += Integer.valueOf(b.substring(i,i+1));
        }
        if(x%a != 0){
            answer = false;
        }
        return answer;
    }

}
