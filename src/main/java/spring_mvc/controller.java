package spring_mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller {
    @RequestMapping(value = "/employee")
    public class MyController {

        @RequestMapping("/")
        public String scowFirst() {
            return "first-view";
        }
    }
}

