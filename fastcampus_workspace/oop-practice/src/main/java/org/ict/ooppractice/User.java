package org.ict.ooppractice;

public class User {
    private String password;

    public void initPassword(PasswordGenerator passwordGenerator){
        //as- is 방식
        //RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator();
        //String randomPassword = randomPasswordGenerator.generatePassword();
        String randomPassword = passwordGenerator.generatePassword();
        if(randomPassword.length()>=8&&randomPassword.length()<=12){
            this.password = randomPassword;
        }
    }

    public String getPassword(){
        return this.password;
    }

}
