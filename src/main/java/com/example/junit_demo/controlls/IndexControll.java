package com.example.junit_demo.controlls;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author star
 * @date 2022/5/1 14:44
 * @since 1.0.0
 */

@RestController
@CrossOrigin
public class IndexControll {

    @GetMapping("")
    public String method() {
        return "hello world1111";
    }

}
