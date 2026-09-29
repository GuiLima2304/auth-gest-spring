package rocket.modules.candidate.controllers;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rocket.modules.candidate.CandidateEntity;
import rocket.modules.candidate.useCases.CreateCandidateUseCase;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

    @Autowired //significa que tudo que estiver aqui abaixo, o spring vai instanciar automaticamente
    private CreateCandidateUseCase createCandidateUseCase;

    @PostMapping("/")
    public ResponseEntity<Object> create(@Valid @RequestBody CandidateEntity candidateEntity) {
        try {
            var result = this.createCandidateUseCase.execute(candidateEntity);
            return ResponseEntity.ok().body(result);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }

    }
}
