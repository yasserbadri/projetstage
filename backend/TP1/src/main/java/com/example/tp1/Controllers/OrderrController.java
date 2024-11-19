package com.example.tp1.Controllers;

import com.example.tp1.Model.Customer;
import com.example.tp1.Model.Orderr;
import com.example.tp1.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class OrderrController {
    @Autowired
    OrderService orderService;
    @RequestMapping("/addOrderr")
    public String addOrderr(Model model){
        Orderr orderr =new Orderr();
        model.addAttribute("OrderrForm",orderr);
        return "new_orderr";
    }
    @RequestMapping(value = "/saveOrderr",method = RequestMethod.POST)
    public String saveOrder(@ModelAttribute("OrderrForm") Orderr orderr){
        orderService.createOrder(orderr);
        return "redirect:/allOrderr";
    }
    @RequestMapping("/allOrderr")
    public String listOrder(Model model){
        List<Orderr> listOrder = orderService.getAllOrderr();
        model.addAttribute("listOrder",listOrder);
        return "liste_orders";
    }
    @GetMapping("deleteOrder/{id}")
    public String deleteOrderr(@PathVariable("id")long id){
        orderService.deleteOrderr(id);
        return "redirect:/all";
    }
}
