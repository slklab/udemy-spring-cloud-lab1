package pl.klab.udemy.lab1.bootapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

    @RequestMapping("/")
    public String hello() {
        return "hello";
    }

}
