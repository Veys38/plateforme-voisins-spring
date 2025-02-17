package be.technifutur.copains.dl.entities;

import be.technifutur.copains.dl.enums.UserRole;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "user_")
@Getter
@NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode @ToString
public class User {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    @Column(nullable = false, unique = true, length = 50)
    private String username;

    @Setter
    @Column(nullable = false)
    private String password;

    @Setter
    @Column(nullable = false)
    private UserRole role;

    @Setter
    private boolean isActive;


}
