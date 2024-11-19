package com.example.tp1.Controllers;

import com.example.tp1.Model.Category;
import com.example.tp1.Model.Customer;
import com.example.tp1.Model.Product;
import com.example.tp1.Service.CategoryService;
import com.example.tp1.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @RequestMapping("/addCustomer")
    public String addCategory(Model model){
        Customer customer =new Customer();
        model.addAttribute("CustomerForm",customer);
        return "new_customer";
    }
    @RequestMapping(value = "/saveCustomer",method = RequestMethod.POST)
    public String saveCustomer(@ModelAttribute("CustomerForm") Customer customer){
        customerService.createCustomer(customer);
        return "redirect:/allCustomer";
    }
    @RequestMapping("/allCustomer")
    public String listCustomer(Model model){
        List<Customer> listCustomer = customerService.getAllCustomer();
        model.addAttribute("listCustomer",listCustomer);
        return "liste_customer";
    }
    @GetMapping("deleteCustomer/{id}")
    public String deleteCustomer(@PathVariable("id")long id){
        customerService.deleteCustomer(id);
        return "redirect:/all";
    }
}
