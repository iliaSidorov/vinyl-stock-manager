package com.iliasidorov.vinylstockmanager.controller;

import com.iliasidorov.vinylstockmanager.model.Vinyl;
import com.iliasidorov.vinylstockmanager.service.VinylService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class AppController {

    @Autowired
    private VinylService service;

    @RequestMapping("/")
    public String viewHomePage(Model model) {
        List<Vinyl> vinylList = service.listAll();
        model.addAttribute("vinylList", vinylList);
        return "index";
    }

    @RequestMapping("/new")
    public String showNewItemForm(Model model) {
        Vinyl vinyl = new Vinyl();
        model.addAttribute("vinyl", vinyl);
        return "new_item";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveNewItem(@ModelAttribute("vinyl") Vinyl vinyl) {
        service.save(vinyl);

        return "redirect:/";
    }
}
