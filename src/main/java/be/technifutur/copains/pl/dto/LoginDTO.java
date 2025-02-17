package be.technifutur.copains.pl.dto;

import lombok.*;

@Getter @Setter
@ToString @EqualsAndHashCode
@NoArgsConstructor @AllArgsConstructor
public class LoginDTO {
    private String username;
    private String password;
}
