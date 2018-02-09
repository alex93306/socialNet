package org.mycompany.validators;

import org.apache.commons.lang.StringUtils;
import org.mycompany.entities.User;

public class UserValidator {
    public static void validateSave(User user, ValidationResult result) {
        if(StringUtils.isEmpty(user.getEmail())) {
            result.addError("email", "Empty email");
        }
    }
}
