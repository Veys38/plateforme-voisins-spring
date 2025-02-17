package be.technifutur.copains.bll.services;

import be.technifutur.copains.dl.entities.CustomerTask;
import be.technifutur.copains.dl.entities.User;

import java.util.List;

public interface CustomerTaskService {
    List<CustomerTask> getAllCustomerTask();
    CustomerTask getCustomerTaskById(Long id);
    void addCustomerTask(User user, CustomerTask customerTask);
    void updateCustomerTask(User user,CustomerTask customerTask);
    void deleteCustomerTask(Long id);
}
