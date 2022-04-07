public class 핸드폰_번호_가리기 {

    public static void main(String[] args) {
        String phone_number = "01052376489";
        System.out.println(solution(phone_number));
    }

    public static String solution(String phone_number) {
        char[] answer = phone_number.toCharArray();
        for(int i= 0; i<phone_number.length()-4 ; i++){
            answer[i] = '*';
        }
        return String.valueOf(answer);
    }

}
