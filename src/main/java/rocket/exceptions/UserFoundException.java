package rocket.exceptions;

public class UserFoundException extends RuntimeException {
    public UserFoundException() {
        super("Üsuario ja existe");
    }
}
