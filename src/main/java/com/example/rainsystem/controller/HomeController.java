package com.example.rainsystem.controller;

import com.example.rainsystem.domain.RainQuality;
import com.example.rainsystem.service.impl.RainQualityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private RainQualityServiceImpl rainQualityServiceimpl;
    @RequestMapping("/")
    public String Home(Model model){
        List<RainQuality> list= rainQualityServiceimpl.SelectAll();
        model.addAttribute("list",list);
        return "home";
    }
    @RequestMapping("/delete")
    public String Remove(Integer id){
        rainQualityServiceimpl.Delete(id);
        return "redirect:/";
    }

}
