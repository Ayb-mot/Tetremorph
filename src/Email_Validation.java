import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email_Validation {
    public static boolean email_validation (String email){
        boolean status = false;
        String email_Pattern = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern =Pattern.compile(email_Pattern);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            status = true;
        } else {
            status = false;
        }
        return status;
    }
}
