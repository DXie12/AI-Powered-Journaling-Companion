/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.job;

/**
 *
 * @author dxie1
 */
public class Logins {
    public static String[] users = {"test"};
    public static String[] passwords = {"pass"};
    
    public static void adduser(String newuser) {
        String[] newArray = new String[users.length + 1];  // bigger array
        System.arraycopy(users, 0, newArray, 0, users.length);
        newArray[users.length] = newuser;  // add new word
        users = newArray;  // replace old array
    }
    
        public static void addpass(String newpass) {
        String[] newArray = new String[passwords.length + 1];  // bigger array
        System.arraycopy(passwords, 0, newArray, 0, passwords.length);
        newArray[passwords.length] = newpass;  // add new word
        passwords = newArray;  // replace old array
    }
}
