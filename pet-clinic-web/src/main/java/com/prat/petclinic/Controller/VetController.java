package com.prat.petclinic.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/vets")
@Controller
public class VetController {

    @GetMapping({"/","","/index"})
    public String listVets(){
        return "Vets/vetsIndexPage";
    }
}
