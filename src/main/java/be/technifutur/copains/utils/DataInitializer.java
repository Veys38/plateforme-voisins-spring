package be.technifutur.copains.utils;

import be.technifutur.copains.bll.services.CustomerTaskService;
import be.technifutur.copains.bll.services.UserService;
import be.technifutur.copains.dal.repositories.CustomerTaskRepository;
import be.technifutur.copains.dal.repositories.UserRepository;
import be.technifutur.copains.dl.entities.CustomerTask;
import be.technifutur.copains.dl.entities.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import static be.technifutur.copains.dl.enums.UserRole.CUSTOMER;

@Component
public class DataInitializer implements CommandLineRunner {

    private final UserRepository userRepository;
    private final UserService userService;
    private final CustomerTaskRepository customerTaskRepository;
    private final CustomerTaskService customerTaskService;


    public DataInitializer(UserRepository userRepository, UserService userService, CustomerTaskRepository customerTaskRepository, CustomerTaskService customerTaskService) {
        this.userRepository = userRepository;
        this.userService = userService;
        this.customerTaskRepository = customerTaskRepository;
        this.customerTaskService = customerTaskService;
    }


    @Override
    public void run(String... args) throws Exception {
        User user = new User("TheBigPush", "1", CUSTOMER, true);

        userRepository.save(user);

        CustomerTask customerTask = new CustomerTask("Babysitter", "I can take care of your babies", "meganFox.png", 1000, user);
        customerTaskRepository.save(customerTask);
    }
}
