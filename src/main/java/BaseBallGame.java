import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.stream.IntStream;

public class BaseBallGame {
    String answer = "";
    String input = "";
    public String chooseAnswer() {
        Random random = new Random();
        while (answer.length() < 3) {
            int nextInt = random.nextInt(9)+1; //1부터 9까지
            if(answer.contains(String.valueOf(nextInt))) continue; //중복안되게 다시 숫자 뽑음
            answer = answer + nextInt;
        }
        return answer;
    }
    public String chooseInput() throws IOException { //사용자가 입력한 숫자
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String readLine = bufferedReader.readLine();
        return readLine;
    }
    public String compareAnswerAndInput(String answer, String input) {
        int intStrike = 0;
        int intBall = 0;
        int intEct = 0;
        for (int i = 0; i < input.length(); i++) {
            //if(answer.indexOf(answer.charAt(i)) == i)
        }
        return "";
    }

}
