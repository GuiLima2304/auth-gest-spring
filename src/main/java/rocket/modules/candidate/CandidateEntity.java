package rocket.modules.candidate;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import jakarta.validation.constraints.Email;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity(name="candidate")
public class CandidateEntity {

    //quando eu coloco a anotation @Entity, ele ja entende como uma coluna no DB

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;

    @Pattern(regexp="^[^\\s]+$", message="O campo username nao deve conter espaco")
    private String username;

    @Length(min= 10, max=100)
    private String password;

    @Email(message = "O campo email deve conter um email valido")
    private String email;
    private String description;
    private String curriculo;

    @CreationTimestamp
    private LocalDateTime createdAt;

}
