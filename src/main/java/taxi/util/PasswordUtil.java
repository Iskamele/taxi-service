package taxi.util;

public interface PasswordUtil {
    String hashPassword(String password);

    boolean checkPassword(String dbPassword, String loginPassword);
}
