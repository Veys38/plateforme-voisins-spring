package be.technifutur.copains.dal.repositories;

import be.technifutur.copains.dl.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
