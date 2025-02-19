package be.technifutur.copains.utils;

import be.technifutur.copains.bll.services.CustomerTaskService;
import be.technifutur.copains.bll.services.UserService;
import be.technifutur.copains.dal.repositories.CustomerTaskRepository;
import be.technifutur.copains.dal.repositories.UserRepository;
import be.technifutur.copains.dl.entities.CustomerTask;
import be.technifutur.copains.dl.entities.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

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
        if(customerTaskRepository.count() == 0) {

            List<User> users = userRepository.saveAll(List.of(
                    new User("TheBigPush", "1", CUSTOMER, true),
                    new User("KendrickLamar", "1", CUSTOMER, true),
                    new User("2Pac", "1", CUSTOMER, true),
                    new User("Big", "1", CUSTOMER, true),
                    new User("Jennifer", "1", CUSTOMER, true),
                    new User("Damien", "1", CUSTOMER, true),
                    new User("Nico", "1", CUSTOMER, true),
                    new User("Thomas", "1", CUSTOMER, true),
                    new User("Titou", "1", CUSTOMER, true),
                    new User("Dylan", "1", CUSTOMER, true),
                    new User("Claire", "1", CUSTOMER, true),
                    new User("Thibault", "1", CUSTOMER, true),
                    new User("Vincent", "1", CUSTOMER, true),
                    new User("Seba", "1", CUSTOMER, true),
                    new User("Jolan", "1", CUSTOMER, true),
                    new User("Seb", "1", CUSTOMER, true),
                    new User("Danjel", "1", CUSTOMER, true),
                    new User("Veys", "1", CUSTOMER, true),
                    new User("Barnabé", "1", CUSTOMER, true),
                    new User("Yannick", "1", CUSTOMER, true)

            ));


            List<CustomerTask> tasks = List.of(
                    new CustomerTask("Babysitter", "I can take care of your babies", "1.jpg", 1000, users.get(0)),
                    new CustomerTask("Garden", "I can mow your grass", "2.jpg", 100, users.get(1)),
                    new CustomerTask("Heat", "I can repair your heat", "3.jpg", 500, users.get(2)),
                    new CustomerTask("Electrician", "I can change your lamp", "4.jpg", 10, users.get(3)),
                    new CustomerTask("Smartphone", "My smartphone is broke", "5.jpg", 200, users.get(4)),
                    new CustomerTask("Cofee Machine broken", "Someone can repair my cofee machine please", "6.jpg", 10, users.get(5)),
                    new CustomerTask("old guy", "I need help for buy groceries", "7.jpg", 15, users.get(6)),
                    new CustomerTask("old lady", "I make chrismas cake", "8.jpg", 70, users.get(7)),
                    new CustomerTask("school", "I can take your childs to school", "9.jpg", 15, users.get(8)),
                    new CustomerTask("carwash", "I wash car at your place", "10.jpg", 50, users.get(9)),
                    new CustomerTask("clean home", "I can clean your home", "11.jpg", 100, users.get(10)),
                    new CustomerTask("music", "I need somoene to build a mix", "12.jpg", 200, users.get(11)),
                    new CustomerTask("car broken", "Somoene does know about cars?", "13.jpg", 200, users.get(12)),
                    new CustomerTask("tires", "I can change the tires of your cars", "14.jpg", 40, users.get(13)),
                    new CustomerTask("dress", "did someoene can repair my sweather?", "15.jpg", 5, users.get(14)),
                    new CustomerTask("barmaid", "I perform for weddings", "16.jpg", 500, users.get(15)),
                    new CustomerTask("cameraman", "the best videos for your parties", "17.jpg", 1500, users.get(16)),
                    new CustomerTask("Striper", "did somoene know a male stripper for birthday", "18.jpg", 150, users.get(17)),
                    new CustomerTask("kitchen", "I make delicious foods", "19.jpg", 15, users.get(18)),
                    new CustomerTask("gaming", "wanted friend for gaming night", "20.jpg", 0, users.get(19))
            );
            customerTaskRepository.saveAll(tasks);

        }
    }
}
