package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Write your name: ");
            String name = scan.nextLine();

            if (name.matches("^[a-zA-Z] * $")) {
                throw new NewException();
            }
            System.out.println("Write your password: ");
            String password = scan.nextLine();
            if (password.length() < 6) {
                throw new NewException();
            }
            System.out.println("Enter your age: ");
            int age = scan.nextInt();
            if (age < 0) {
                throw new NewException();
            }
            Person person = new Person();
            person.setName(name);
            person.setPassword(password);
            person.setAge(age);
            System.out.println(person);
        } catch (NewException e) {
            System.out.println("Wrong input");
        } catch (InputMismatchException e) {
            System.out.println("Age can't be String");
        }
    }
}

