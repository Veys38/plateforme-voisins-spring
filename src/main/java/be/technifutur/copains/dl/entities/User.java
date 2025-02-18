package be.technifutur.copains.dl.entities;

import be.technifutur.copains.dl.enums.UserRole;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "user_")
@NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode @ToString
public class User {

    @Getter
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter @Getter
    @Column(nullable = false, unique = true, length = 50)
    private String username;

    @Setter @Getter
    @Column(nullable = false)
    private String password;

    @Setter @Getter
    @Column(nullable = false)
    private UserRole role;

    @Setter @Getter
    private boolean isActive;

    public User(String username, String password, UserRole role, boolean isActive) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.isActive = isActive;
    }
}
