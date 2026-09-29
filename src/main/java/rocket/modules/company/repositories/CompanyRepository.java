package rocket.modules.company.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import rocket.modules.candidate.CandidateEntity;
import rocket.modules.company.entities.CompanyEntity;

import java.util.Optional;
import java.util.UUID;

public interface CompanyRepository extends JpaRepository<CompanyEntity, UUID> {
    Optional<CompanyEntity> findByUsernameOrPassword(String username, String email);
}
