package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    @Test
    void replace() {
        //clone test2
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");w
    }
}
