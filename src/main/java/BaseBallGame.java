import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class BaseBallGame {
    String answer = "";
    String input = "";

    public String chooseAnswer() {
        Random random = new Random();
        while (answer.length() < 3) {
            int nextInt = random.nextInt(9) + 1; //1부터 9까지
            if (answer.contains(String.valueOf(nextInt))) continue; //중복안되게 다시 숫자 뽑음
            answer = answer + nextInt;
        }
        return answer;
    }

    public String chooseInput() throws IOException { //사용자가 입력한 숫자
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("숫자를 입력해 주세요 : ");
        String readLine = bufferedReader.readLine();
        return readLine;
    }

    public String compareAnswerAndInput(String answer, String input) {
        int intStrike = 0;
        int intBall = 0;
        int intEct = 0;
        for (int i = 0; i < answer.length(); i++) {
            if(answer.charAt(i)==input.charAt(i)) intStrike++;
            if(answer.charAt(i)!=input.charAt(i)) if(input.contains(String.valueOf(answer.charAt(i)))) intBall++;
        }
        if(intBall>0 && intStrike>0) { System.out.println(intBall+"볼 "+intStrike+"스트라이크"); return "Fail";}
        if(intStrike>0) {
            if(intStrike == 3) return "Success";
            System.out.println(intStrike+"스트라이크");
            return "Fail";
        }
        if(intBall>0) { System.out.println(intBall+"볼 "); return "Fail";}
        System.out.println("낫싱");
        return "Fail";
    }

    public static void main(String[] args) {

    }

}
