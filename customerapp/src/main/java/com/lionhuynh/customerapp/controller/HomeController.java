package com.lionhuynh.customerapp.controller;

import com.lionhuynh.lib.util.CommonUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping({"", "/"})
    public String getMyName(Model model){
        String myName = CommonUtil.getNameApp();
        model.addAttribute("myName", myName);
        return "index";
    }
}
