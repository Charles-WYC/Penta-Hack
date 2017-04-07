package org.PentaHack.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 王贇超 on 2017/4/5.
 */

@Controller
public class IndexController {
    @RequestMapping("/")
    public String index() {return "forward:/LoginPage.html";}

    @RequestMapping("/login")
    public String loginPage() {return "forward:/LoginPage.html";}

    @RequestMapping("/loginSuccess")
    public String loginSuccess() {return "forward:/LoginSuccess.html";}
}
