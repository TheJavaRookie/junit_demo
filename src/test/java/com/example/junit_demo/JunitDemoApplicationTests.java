package com.example.junit_demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = JunitDemoApplication.class)
class JunitDemoApplicationTests {

    @Test
    void contextLoads() {
        System.out.println('1');
    }

}
