package com.cgm.springjenkins;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String get() {
        return "xxxx";
    }



    @RequestMapping("/hello2")
    public String get2() {
        return "hello2";
    }

    @RequestMapping("/hello3")
    public String get3() {
        return "hello3";
    }

    @RequestMapping("/hello4")
    public String get4() {
        return "hello Docker";
    }
}
