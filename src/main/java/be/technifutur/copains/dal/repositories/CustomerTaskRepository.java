package be.technifutur.copains.dal.repositories;

import be.technifutur.copains.dl.entities.CustomerTask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerTaskRepository extends JpaRepository<CustomerTask, Long> {


    boolean existsByUser_IdAndTaskName(Long userId, String serviceName);
}
