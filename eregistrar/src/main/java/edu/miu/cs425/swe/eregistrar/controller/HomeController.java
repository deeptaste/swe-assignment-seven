package edu.miu.cs425.swe.eregistrar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping(value = {"/", "/eregister", "/eregister/home"})
    public String displayHomePage() {
        return "home/index";
    }
}
