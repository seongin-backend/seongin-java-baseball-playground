package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

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
        String str = "(1,2)2s";
        str = str.substring(0,2);
        str = str.substring(str.length()-1, str.length());
        assertThat(str).contains("1,2");
    }
}
