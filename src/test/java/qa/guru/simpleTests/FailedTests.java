package qa.guru.simpleTests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

@Tag("simple")
public class FailedTests {

    @Test
    void test1(){
        assertFalse(true);
    }

    @Test
    void test2(){
        assertFalse(true);
    }

    @Test
    void test3(){
        assertFalse(true);
    }
}
