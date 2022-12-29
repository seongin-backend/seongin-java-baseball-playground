package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.*;

public class StringTest {
    @Test
    void split() {
        //0. 학습테스트실습
        /*요구사항1
        "1,2"을 ,로 split 했을 때 1과 2로 잘 분리되는지 확인하는 학습 테스트를 구현한다.
        "1"을 ,로 split 했을 때 1만을 포함하는 배열이 반환되는지에 대한 학습 테스트를 구현한다.
        */
        /**********"1,2"을 ,로 split 했을 때 1과 2로 잘 분리되는지 확인하는 학습 테스트를 구현한다.***********/
        String[] actual = "1,2".split(",");
        assertThat(actual).containsExactly("1", "2");
        /********"1,2"을 ,로 split 했을 때 1과 2로 잘 분리되는지 확인하는 학습 테스트를 구현한다. 끝***********/

        /********"1"을 ,로 split 했을 때 1만을 포함하는 배열이 반환되는지에 대한 학습 테스트를 구현한다.***********/
        actual = "1".split(",");
        assertThat(actual).contains("1");
        /********"1"을 ,로 split 했을 때 1만을 포함하는 배열이 반환되는지에 대한 학습 테스트를 구현한다. 끝**********/

    }

    @Test
    void substring() {
        /*요구사항 2*/
        /*"(1,2)" 값이 주어졌을 때 String의 substring() 메소드를 활용해 ()을 제거하고 "1,2"를 반환하도록 구현한다.*/
        String str = "(1,2)";
        str = str.substring(1,str.length()-1);
        assertThat(str).contains("1,2");
    }

    @Test
    @DisplayName("StringIndexOutOfBoundsException 에러 발생시키고 Exception 테스트")
    void charAt() {
        /*charAt 특정위치찾기*/
        String str = "abc";
        int index = 3;
        assertThatThrownBy(() -> {
            char c = str.charAt(index);
        }).isInstanceOf(StringIndexOutOfBoundsException.class)
                .hasMessageContaining("%d", index);

    }

}
