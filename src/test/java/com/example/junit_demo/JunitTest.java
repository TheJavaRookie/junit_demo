package com.example.junit_demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author star
 * @date 2022/4/25 22:36
 * @since 1.0.0
 */

@SpringBootTest(classes = JunitDemoApplicationTests.class)
public class JunitTest {

    @Test
    public void method() {
        System.out.println("123");
    }
}
