package br.com.livraria.validadores;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author - Everton Ribeiro
 * @email - everton.nrb@gmail.com
 **/
@FacesValidator(value = "br.com.livraria.validadores.ISNBValidador")
public class ISNBValidador implements Validator {

    @Override
    public void validate(FacesContext facesContext, UIComponent uiComponent, Object o) throws ValidatorException {
        String isbnDigitado = (String) o;
        Pattern pattern = Pattern.compile("\\d{1,2}-\\d{3,5}-\\d{3,4}-[0-9xX]{1}");
        Matcher matcher = pattern.matcher(isbnDigitado);
        boolean ok = matcher.matches();
        FacesMessage message = new FacesMessage();
        message.setDetail("ISBN: Formato inválido");
        message.setSummary("ISBN inválido");
        message.setSeverity(FacesMessage.SEVERITY_FATAL);
        throw new ValidatorException(message);
    }
}
