package rocket.modules.company.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity(name = "job")
@Data
public class JobEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String description;
    private String benefits;

    @NotBlank(message = "Esse campo eh obrigatorio")
    private String level;

    @ManyToOne() //ORM vai entender para manipular os dados o company_id do UUID
    @JoinColumn(name = "company_id", insertable = false, updatable = false) //quando eu for inserir um job, se eu nao tiver um id inexistente, precisa dar erro
    private CompanyEntity companyEntity;

    @Column(name = "company_id", nullable = false)
    private UUID companyId;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
