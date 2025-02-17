package be.technifutur.copains.pl.dto;

import lombok.*;

@Getter @Setter
@ToString @EqualsAndHashCode
@NoArgsConstructor @AllArgsConstructor
public class CustomerTaskDTO {
    private Long id;
    private String userName;
    private String photo;
    private String budget;
}
