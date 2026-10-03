package rocket.modules.candidate.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder //conseguir criar a instancia do objeto de forma mais fácil, sem precisar passar todos os parâmetros no construtor
public class AuthCandidateResponseDTO {

    private String access_token;

}
