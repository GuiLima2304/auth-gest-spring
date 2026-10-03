package rocket.modules.candidate.dto;

public record AuthCandidateRequestDTO(
    String username,
    String password
) {
}