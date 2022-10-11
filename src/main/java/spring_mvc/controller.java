package spring_mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/employee")
public class controller {

    @RequestMapping("/")
    public String scowFirst() {
        return "first-view";
    }
    }

