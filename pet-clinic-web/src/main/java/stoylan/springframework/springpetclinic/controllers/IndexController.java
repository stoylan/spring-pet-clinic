package stoylan.springframework.springpetclinic.controllers;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController implements ErrorController {

    @RequestMapping({"","/","index","index.html"})
    public String index(){
        return "index";
    }

    @RequestMapping("/oups")
    public String myerror() {
        return "notimplemented";
    }

    @Override
    public String getErrorPath() {
        return "/oups";
    }
}
