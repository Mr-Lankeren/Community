package luo.lankeren.community.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller     //注解
public class IndexController {
    @GetMapping("/")
    public String index() {
        return "index";
    }
}
