package com.example.tp1.Controllers;

import com.example.tp1.Model.Subcategory;
import com.example.tp1.Model.User;
import com.example.tp1.Service.SubcategoryService;
import com.example.tp1.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/addUser")
    public String addUser(Model model){
        User user =new User();
        model.addAttribute("UserForm",user);
        return "new_user";
    }
    @RequestMapping(value = "/saveUser",method = RequestMethod.POST)
    public String saveUser(@ModelAttribute("UserForm") User user){
        userService.createUser(user);
        return "redirect:/all";
    }
}
