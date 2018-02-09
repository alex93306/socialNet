package org.mycompany.managers;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface EmailManager {
    void sendEmail(String email, String subject, String text) throws IOException;
}
