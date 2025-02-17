package be.technifutur.copains.bll.services.impls;

import be.technifutur.copains.dl.entities.CustomerTask;
import be.technifutur.copains.bll.services.CustomerTaskService;
import be.technifutur.copains.dal.repositories.CustomerTaskRepository;
import be.technifutur.copains.dl.entities.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerTaskServiceImpl implements CustomerTaskService {

    private CustomerTaskRepository customerTaskRepository;

    @Override
    public List<CustomerTask> getAllCustomerTask() {
        return customerTaskRepository.findAll();
    }

    @Override
    public CustomerTask getCustomerTaskById(Long id) {
        return customerTaskRepository.findById(id).orElseThrow();
    }

    @Override
    public void addCustomerTask(User user,CustomerTask customerTask) {
        if(customerTaskRepository.existsByUser_IdAndTaskName(user.getId(),customerTask.getTaskName())) {
            throw new RuntimeException(customerTask.getTaskName() + " already exists with the user name " + user.getUsername());
        }
        customerTaskRepository.save(customerTask);
    }

    @Override
    public void updateCustomerTask(User user, CustomerTask customerTask) {
        CustomerTask oldCustomerTask = customerTaskRepository.findById(customerTask.getId()).orElseThrow(
                () -> new RuntimeException("Customer Task does not exist with the id " + customerTask.getId())
        );
        if(customerTaskRepository.existsByUser_IdAndTaskName(user.getId(),customerTask.getTaskName())) {
            throw new RuntimeException(customerTask.getTaskName() + " already exists with the user name " + user.getUsername());
        }
        oldCustomerTask.setTaskName(customerTask.getTaskName());
        oldCustomerTask.setDescription(customerTask.getDescription());
        oldCustomerTask.setPhoto(customerTask.getPhoto());
        oldCustomerTask.setBudget(customerTask.getBudget());
        customerTaskRepository.save(oldCustomerTask);
    }

    @Override
    public void deleteCustomerTask(Long id) {
        if(!customerTaskRepository.existsById(id)){
            throw new RuntimeException("Cannot delete customer task with id " + id);
        }
        customerTaskRepository.deleteById(id);
    }
}
