package test;

import org.springframework.stereotype.Controller;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.TimeZone;
import java.util.Date;
import java.text.SimpleDateFormat;

@Controller
@EnableAutoConfiguration
public class HelloController
{
    @RequestMapping("/")
    @ResponseBody
    public String home() {
        TimeZone tz = TimeZone.getTimeZone("Asia/Tokyo");
        SimpleDateFormat sdf = new SimpleDateFormat("MMMMM dd, yyyy HH:mm");
        sdf.setTimeZone(tz);
        return "[" + sdf.format(new Date()) +  "] Hello, Spring Boot Sample Application!! Deployed!!";
    }
}
