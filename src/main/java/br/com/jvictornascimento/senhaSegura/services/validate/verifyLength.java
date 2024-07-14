package br.com.jvictornascimento.senhaSegura.services.validate;

import br.com.jvictornascimento.senhaSegura.services.ValidateException;
import org.springframework.stereotype.Component;

@Component
public class verifyLength implements IValidate{

    @Override
    public void valide(String password) {
        if (password.length() < 8){
                throw new ValidateException("Password must be at least 8 characters long");
        }
    }
}
