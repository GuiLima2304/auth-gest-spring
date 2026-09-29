package rocket.modules.company.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.UUID;

@Entity(name = "company")
@Data
public class CompanyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Pattern(regexp="^[^\\s]+$", message="O campo username nao deve conter espaco")
    private String username;

    @Length(min= 10, max=100)
    private String password;

    @Email(message = "O campo email deve conter um email valido")
    private String email;
    private String website;
    private String name;
    private String description;

}
