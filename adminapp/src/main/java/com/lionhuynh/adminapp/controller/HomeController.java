package com.lionhuynh.adminapp.controller;

import com.lionhuynh.lib.util.CommonUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping({"", "/", "/home"})
    public String getHomePage(Model model){
        String myNameApp = CommonUtil.getNameApp();
        model.addAttribute("myName", myNameApp);
        return "index";
    }
}
