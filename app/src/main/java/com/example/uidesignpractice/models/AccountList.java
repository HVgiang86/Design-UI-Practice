package com.example.uidesignpractice.models;

import java.util.ArrayList;
import java.util.List;

public class AccountList {
    public static List<Account> accountList = new ArrayList<Account>();

    public static boolean isExistAccount (String username, String password) {
        for (Account x : accountList) {
            if (x.getUsername().equals(username) && x.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isExistUsername (String username) {
        for (Account x : accountList) {
            if (x.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    public static void addAccount (String username, String password) {
        Account account = new Account(username,password);
        accountList.add(account);
    }

    public static Account getAccountObject (String username, String password) {
        for (Account x : accountList) {
            if (x.getUsername().equals(username) && x.getPassword().equals(password)) {
                return x;
            }
        }
        return null;
    }

    public static void deleteAccount (String username, String password) {
        Account temp = getAccountObject(username, password);
        if (temp != null) {
            accountList.remove(temp);
        }
    }
}
