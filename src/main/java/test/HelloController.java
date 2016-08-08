package test;

import org.springframework.stereotype.Controller;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.Date;

@Controller
@EnableAutoConfiguration
public class HelloController
{
    @RequestMapping("/")
    @ResponseBody
    public String home() {
        Date date = new Date();
        return "[" + date.toString() +  "] Hello, Spring Boot Sample Application!! Deployed!!";
    }
}
