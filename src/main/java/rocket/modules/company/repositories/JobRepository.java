package rocket.modules.company.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import rocket.modules.company.entities.JobEntity;

import java.util.UUID;

public interface JobRepository extends JpaRepository<JobEntity, UUID> {
}
