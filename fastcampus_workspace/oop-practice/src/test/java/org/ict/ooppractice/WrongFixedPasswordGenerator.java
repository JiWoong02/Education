package org.ict.ooppractice;

public class WrongFixedPasswordGenerator implements PasswordGenerator {

    @Override
    public String generatePassword() {
        return "aa";
    }
}
