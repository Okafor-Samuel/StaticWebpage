package com.example.staticwebpage.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class MainController {
    @GetMapping ("about")
    public ModelAndView about(){
        return new ModelAndView("about");
    }

    @GetMapping("blog")
    public ModelAndView blog(){
        return new ModelAndView("blog");
    }

    @GetMapping("contact")
    public ModelAndView contact(){
        return new ModelAndView("contact");
    }


    @GetMapping("index")
    public ModelAndView HomePage(){
        return new ModelAndView("index");
    }

    @GetMapping("service")
    public ModelAndView service(){
        return new ModelAndView("service");
    }

    @GetMapping("testimonial")
    public ModelAndView testimonial(){
        return new ModelAndView("testimonial");
    }
}
