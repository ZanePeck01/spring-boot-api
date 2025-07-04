package com.codewithmosh.store.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    /**
     * This controller handles requests to the root URL and the /hello URL.
     * It returns the index.html file for both requests.
     */
    @RequestMapping("/")
    public String index(Model model) {

        // The model attribute "name" can be used in the Thymeleaf template.
        model.addAttribute("name", "Zane");

        return "index.html";
    }

}
