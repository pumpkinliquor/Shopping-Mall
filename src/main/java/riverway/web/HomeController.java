package riverway.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    
    private static final Logger log = LoggerFactory.getLogger(HomeController.class);

    @GetMapping("/")
    public String goHome(){
        return "/index";
    }

    @GetMapping("/login")
    public String loginForm(){
        return "/user/login";
    }

    @GetMapping("/users/form")
    public String create(){
        return "/user/form";
    }

    @GetMapping("/products")
    public String show(){
        return "/product/shop";
    }

    @GetMapping("/products/form")
    public String createForm(){
        return "/product/form";
    }
}
