package com.example.tp1.Controllers;

import com.example.tp1.Model.Product;
import com.example.tp1.Service.ProductService;
import com.example.tp1.Service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;
    @Autowired
    ProviderService providerService;
    @RequestMapping("/addProduct")
    public String addProduct(Model model){
        Product product =new Product();
        model.addAttribute("ProductForm",product);
        model.addAttribute("ProviderForm",provider);
        return "new_product";
    }
    @RequestMapping(value = "/saveProduct",method = RequestMethod.POST)
    public String saveProduct(@ModelAttribute("ProductForm") Product product){
        productService.createProduct(product);
        return "redirect:/all";
    }
    @RequestMapping("/all")
    public String listProducts(Model model){
        List<Product> listProducts = productService.getAllProduct();
        model.addAttribute("listProducts",listProducts);
        return "liste_products";
    }
    @GetMapping("delete/{id}")
    public String deleteProduct(@PathVariable("id")long id){
        productService.deleteProduct(id);
        return "redirect:/all";
    }
    @GetMapping("edit/{id}")
    public String showUpdateForm(@PathVariable("id")long id ,Model model){
        Product product =productService.getProductById(id);
        model.addAttribute("product",product);
        return "update_product";
    }
    @PostMapping("update/{id}")
    public String updateProduct(@PathVariable("id")long id , Product product){
        productService.updateProduct(product);
        return "redirect:/all";
    }

}
