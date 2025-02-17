package be.technifutur.copains.dl.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity
@EqualsAndHashCode @ToString
@Getter
@AllArgsConstructor @NoArgsConstructor
public class CustomerTask {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    @Column(nullable = false, length = 50)
    private String taskName;

    @Setter
    @Column(nullable = false)
    @Size(min = 1, max = 500)
    private String description;

    @Setter
    @Column(nullable = false)
    private String photo;

    @Setter
    @Column(nullable = false, length = 10)
    private int budget;

    @ManyToOne
    private User user;

}
