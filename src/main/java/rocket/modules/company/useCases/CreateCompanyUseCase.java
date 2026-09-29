package rocket.modules.company.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rocket.exceptions.UserFoundException;
import rocket.modules.company.entities.CompanyEntity;
import rocket.modules.company.repositories.CompanyRepository;

@Service
public class CreateCompanyUseCase {

    @Autowired
    private CompanyRepository companyRepository;

    public CompanyEntity execute(CompanyEntity companyEntity) {
        this.companyRepository.findByUsernameOrPassword(companyEntity.getUsername(), companyEntity.getEmail())
                .ifPresent((user) -> {
                    throw new UserFoundException();
                });
        return this.companyRepository.save(companyEntity);
    }
}
