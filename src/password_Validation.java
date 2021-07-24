import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class password_Validation {
    public static boolean password_validation (String password) {
        boolean stat = false;
        String password_Validation = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$\n";
        Pattern pattern = Pattern.compile(password_Validation);
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()) {
            stat = true;
        }else {
            stat = false;
        }
        return stat;
    }
}
