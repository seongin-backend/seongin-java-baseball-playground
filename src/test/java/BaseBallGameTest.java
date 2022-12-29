import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BaseBallGameTest {
    BaseBallGame baseBallGame;

    @BeforeEach
    void setUp() {
        baseBallGame = new BaseBallGame();
    }

    @Test
    @DisplayName("정답 매긴거 중복된 값 있는지 체크")
    void DuplicateCheck() {
        String answer = baseBallGame.chooseAnswer();
        Boolean expect;
        int cnt = 0;
        for (int i = 0; i < answer.length(); i++) {
            if(answer.indexOf(answer.charAt(i)) != i) cnt++; //indexOf가 일치하는 첫 index 내뱉으니까 안 일치하면 중복된거
        }
        assertThat(cnt).isZero();
    }
}
