package com.example.tp1.Controllers;

import com.example.tp1.Model.Orderr;
import com.example.tp1.Model.Provider;
import com.example.tp1.Service.OrderService;
import com.example.tp1.Service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProviderController {
    @Autowired
    ProviderService providerService;
    @RequestMapping("/addProvider")
    public String addProvider(Model model){
        Provider provider =new Provider();
        model.addAttribute("ProviderForm",provider);
        return "new_provider";
    }
    @RequestMapping(value = "/saveProvider",method = RequestMethod.POST)
    public String saveProvider(@ModelAttribute("ProviderForm") Provider provider){
        providerService.createProvider(provider);
        return "redirect:/allProvider";
    }
    @RequestMapping("/allProvider")
    public String listProvider(Model model){
        List<Provider> listProvider = providerService.getAllProvider();
        model.addAttribute("listProvider",listProvider);
        return "liste_providers";
    }
    @GetMapping("deleteProvider/{id}")
    public String deleteProvider(@PathVariable("id")long id){
        providerService.deleteProvider(id);
        return "redirect:/all";
    }
}
