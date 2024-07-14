package br.com.jvictornascimento.senhaSegura.services.validate;

import br.com.jvictornascimento.senhaSegura.services.ValidateException;
import org.springframework.stereotype.Component;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
@Component
public class verifyExistOneCharLower implements IValidate{
    @Override
    public void valide(String password) {
        Pattern pattern = Pattern.compile("[a-z]");
        Matcher matcher = pattern.matcher(password);
        if (!matcher.find()){
            throw new ValidateException("Password must be lowercase letters");
        }
    }
}
