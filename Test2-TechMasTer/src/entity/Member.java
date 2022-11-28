package entity;

import java.util.Scanner;

public class Member {
    private String userName;
    private String passWord;
    private String email;

    public Member(String userName, String password, String email) {
        this.userName = userName;
        this.passWord = password;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Member{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
