package study;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    // Test Case 구현
    @Test
    void checkHashSetSize() {
        assertThat(numbers.size()).isEqualTo(3);
    }

    @Test
    void contains() {
        assertThat(numbers.contains(1)).isTrue();
        assertThat(numbers.contains(2)).isTrue();
        assertThat(numbers.contains(3)).isTrue();
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    @DisplayName("JUnit의 ParameterizedTest을 활용한 반복 최소화")
    void containsAtParameterizedTest(int number) {//JUnit의 ParameterizedTest을 활용한 반복 최소화
        assertTrue(numbers.contains(number));
    }

    @ParameterizedTest
    @CsvSource({"1,true","2,true","3,true","4,false","5,false"})
    @DisplayName("1,2,3이면 true 4 ,5면 false")
    void containsAtParameterizedTestAndCsvSource(int input, boolean expected) {//1,2,3이면 true 4 ,5면 false
        assertEquals(expected, numbers.contains(input));
    }
}
