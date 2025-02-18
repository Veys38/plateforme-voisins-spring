package be.technifutur.copains.pl.controllers;


import be.technifutur.copains.bll.services.CustomerTaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequiredArgsConstructor
@RequestMapping("/customertask")
@SessionAttributes("id")
public class CustomerTaskController {

    private final CustomerTaskService customerTaskService;

    public String getAllCustomerTasks(Model model){
        model.addAttribute("customerTask", customerTaskService.getAllCustomerTask());
        return "customertask/index";
    }
}
