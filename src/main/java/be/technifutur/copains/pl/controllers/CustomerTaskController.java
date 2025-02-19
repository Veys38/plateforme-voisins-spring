package be.technifutur.copains.pl.controllers;


import be.technifutur.copains.bll.services.CustomerTaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequiredArgsConstructor
@RequestMapping("/")
@SessionAttributes("id")
public class CustomerTaskController {

    private final CustomerTaskService customerTaskService;

    @GetMapping
    public String getAllCustomerTasks(Model model){
        model.addAttribute("customerTasks", customerTaskService.getAllCustomerTask());
        return "/index";
    }

    @GetMapping("/customer-task-details/{id}")
    public String getCustomerTaskById(
            Model model,
            @PathVariable Long id
    ){
        model.addAttribute("customerTaskDetails", customerTaskService.getCustomerTaskById(id));
        return "pages/customerTaskDetails";
    }

}
