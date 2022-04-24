package Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class MainController {
    @RequestMapping(path = "/")
    public String index() {
        return "index";
    }
}
