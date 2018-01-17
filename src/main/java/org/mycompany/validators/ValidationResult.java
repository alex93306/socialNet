package org.mycompany.validators;

import java.util.HashMap;
import java.util.Map;

public class ValidationResult {
    private boolean hasError;
    private Map<String, String> errors = new HashMap<>();
    public void addError(String field, String msg) {
        hasError = true;
        errors.put(field, msg);
    }

    public boolean hasError() {
        return hasError;
    }

    public Map<String, String> getErrors() {
        return errors;
    }

    public void setErrors(Map<String, String> errors) {
        this.errors = errors;
    }
}
