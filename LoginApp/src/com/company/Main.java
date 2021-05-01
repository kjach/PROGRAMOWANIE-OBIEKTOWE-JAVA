package com.company;

import java.util.Scanner;

public class Main {
    private static final User[] user = {
            new User("admin", "psswrd", "token"),
            new User("user", "123", "token"),
            new User("kuba", "haslo", "token"),
            new User("kacper", "password", "token"),
            new User("roman", "maslo", "token")
    };
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean auth = false;

        while (!auth) {
            System.out.println("Witaj, podaj nazwę użytkownika: ");
            String login = scanner.nextLine();
            System.out.println("Podaj hasło: ");
            String haslo = scanner.nextLine();

            for (int i = 0; i < user.length; i++) {
                if (user[i].authenticate(login, haslo)) {
                    System.out.println("Witaj, " + user[i].getUsername());
                    auth = true;
                    break;
                }
            }
            if (auth == false) {System.out.println("Niepoprawne dane logowania. Spróbuj ponownie.");}
        }
    }
}

class User {
    private String username, password, secret;
    public static final String EMPTY_TOKEN = "---";

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public User(String username, String password, String secret) {
        this.username = username;
        this.password = password;
        this.secret = secret;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.secret = EMPTY_TOKEN;
    }

    boolean authenticate(String username, String password) {
        return this.password.equals(password) && this.username.equals(username);
    }

    boolean authenticate(String secret) {
        return this.secret.equals(secret) && !this.secret.equals(EMPTY_TOKEN);
    }
}