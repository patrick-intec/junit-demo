package be.infernalwhale;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Unit tests
// Integration tests
// End-2-End tests

public class CalculatorTest {
    Calculator calculator;

    @BeforeAll
    static void static_int() {
        System.out.println("init - before the class");
    }

    @BeforeEach
    void init() {
        System.out.println("init - BeforeEach");
        calculator = new Calculator();
    }

    @Test
    void test() {
        System.out.println("Running test 1");
    }

    @Test
    void test2() {
        System.out.println("Running test 2");
    }

    @ParameterizedTest
    @ValueSource(strings = { "racecar", "radar", "able was I ere I saw elba" })
    void palindromes(String candidate) {
        System.out.println(candidate);
    }

    @ParameterizedTest
    @MethodSource("sum_params")
    void param_test(SumParam params) {
        int result = calculator.sum(params.a, params.b);

        assertEquals(params.expected, result);
    }

    static Stream<Object> sum_params() {
        return Stream.of(
                new SumParam(1, 2, 3),
                new SumParam(2, 3, 5),
                new SumParam(22, 23, 45),
                new SumParam(-2, -3, -5),
                new SumParam(2, 3, 5),
                new SumParam(2, 3, 5),
                new SumParam(2, 3, 5),
                new SumParam(2, 3, 5),
                new SumParam(2, 3, 5),
                new SumParam(2, 3, 5),
                new SumParam(2, 3, 5),
                new SumParam(2, 3, 5)
        );
    }

    @AfterEach
    void tearDown() {
        System.out.println("After each test");
    }

    @AfterAll
    static void afterClass() {
        System.out.println("Running when all methods done");
    }

    static class SumParam {
        private int a;
        private int b;
        private int expected;

        SumParam(int a, int b, int expected) {
            this.a = a;
            this.b = b;
            this.expected = expected;
        }

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }

        public int getB() {
            return b;
        }

        public void setB(int b) {
            this.b = b;
        }

        public int getExpected() {
            return expected;
        }

        public void setExpected(int expected) {
            this.expected = expected;
        }
    }
}