package stoylan.springframework.springpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import stoylan.springframework.springpetclinic.service.OwnerService;

@Controller
public class OwnerIndexController {

    private final OwnerService ownerService;

    public OwnerIndexController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }


    @RequestMapping("owners")
    public String listOwner(Model model){
        model.addAttribute("owners",ownerService.findAll());

        return "owner";
    }
}
