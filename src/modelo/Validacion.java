package modelo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Validacion {
    
        private static int workload = 12; // for bcrypt
    
    
    public boolean validarCorreo (String str) {
                     // Patrón para validar el email
        Pattern pattern = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        String email = str;
        Matcher mather = pattern.matcher(email);
        if (mather.find() == true) {
            return true;
        } else {
            return false;
        }
    }
    
    
     public static String hashPassword(String password_plaintext) { 
        String salt = BCrypt.gensalt(workload);
        String hashed_password = BCrypt.hashpw(password_plaintext, salt);
        return(hashed_password);
    }
        
        
}
