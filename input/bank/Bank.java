package input.bank;

import java.util.*;

import input.oop.Polymorphism.main;

class Account {
    public String name;
    private int Amount;
    private String email;// private property of class Account
    private String Password;

    public String getPassword() {
        return Password;

    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
}

public class Bank {
    public static void main(String[] args) {
        Account acc1 = new Account();
        acc1.name = "My account";
        acc1.setPassword("zahid1234");
        System.out.println(acc1.getPassword());
    }
}
