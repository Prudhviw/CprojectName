package com.Cpackage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Raj on 11/16/2016.
 */
@Controller
public class Ccontroller {

    @RequestMapping(value = "/c", method= RequestMethod.GET)
    public ModelAndView function(){
        ModelAndView m=new ModelAndView();
        m.setViewName("c");
        String s = "A message in JSP Page";
        m.addObject("front",s);
        return m;
    }

}
