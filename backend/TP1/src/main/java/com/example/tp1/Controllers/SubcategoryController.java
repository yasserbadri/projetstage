package com.example.tp1.Controllers;

import com.example.tp1.Model.Product;
import com.example.tp1.Model.Provider;
import com.example.tp1.Model.Subcategory;
import com.example.tp1.Service.ProviderService;
import com.example.tp1.Service.SubcategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class SubcategoryController {
    @Autowired
    SubcategoryService subcategoryService;
    @RequestMapping("/addSubcategory")
    public String addSubcategory(Model model){
        Subcategory subcategory=new Subcategory();
        model.addAttribute("SubcategoryForm",subcategory);
        return "new_subcategory";
    }
    @RequestMapping(value = "/saveSubcategory",method = RequestMethod.POST)
    public String saveSubcategory(@ModelAttribute("SubcategoryForm") Subcategory subcategory){
        subcategoryService.createSubcategory(subcategory);
        return "redirect:/allSubcategory";
    }
    @RequestMapping("/allSubcategory")
    public String listSubcategory(Model model){
        List<Subcategory> listSubcategorys = subcategoryService.getAllSubcategory();
        model.addAttribute("listSubcategorys",listSubcategorys);
        return "liste_subcategorys";
    }
    @GetMapping("deleteSubcategory/{id}")
    public String deleteSubcategory(@PathVariable("id")long id){
        subcategoryService.deleteSubcategory(id);
        return "redirect:/all";
    }
}
