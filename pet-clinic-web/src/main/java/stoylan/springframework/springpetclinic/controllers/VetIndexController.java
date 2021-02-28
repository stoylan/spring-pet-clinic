package stoylan.springframework.springpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import stoylan.springframework.springpetclinic.service.VetService;

@Controller
public class VetIndexController {

    private final VetService vetService;

    public VetIndexController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping("vets")
    public String listVet(Model model){
        model.addAttribute("vets",vetService.findAll());

        return "vet";
    }
}
