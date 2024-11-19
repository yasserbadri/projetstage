package com.example.tp1.Controllers;


import com.example.tp1.Model.Category;
import com.example.tp1.Model.Product;
import com.example.tp1.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CategoryController {
    @Autowired
    CategoryService categoryService;
    @RequestMapping("/addCategory")
    public String addCategory(Model model){
        Category category =new Category();
        model.addAttribute("CategoryForm",category);
        return "new_category";
    }

    @RequestMapping(value = "/saveCategory",method = RequestMethod.POST)
    public String saveCategory(@ModelAttribute("CategoryForm")Category category){
        categoryService.createCategory(category);
        return "redirect:/allCategories";
    }

    @RequestMapping("/allCategories")
    public String listCategories(Model model){
        List<Category> listCategories = categoryService.getAllCategory();
        model.addAttribute("listCategories",listCategories);
        return "liste_categories";
    }
    @GetMapping("deleteCategory/{id}")
    public String deleteCategory(@PathVariable("id")long id){
        categoryService.deleteCategory(id);
        return "redirect:/allCategories";
    }
    @GetMapping("editCategory/{id}")
    public String showUpdateForm(@PathVariable("id")long id ,Model model){
        Category category =categoryService.getCategoryById(id);
        model.addAttribute("category",category);
        return "update_category";
    }
    @PostMapping("updateCategory/{id}")
    public String updateCategory(@PathVariable("id")long id , Category category){
        categoryService.updateCategory(category);
        return "redirect:/allCategories";
    }

}
