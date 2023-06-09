package com.prat.petclinic.Controller;

import com.prat.petclinic.Service.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnersController {

   private final OwnerService ownerService;


    public OwnersController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @GetMapping({"/","","/index"})
    public String listOfOwners(Model model){
        model.addAttribute("owners",ownerService.findAll());
        return "Owners/ownersIndexPage";
    }

}
