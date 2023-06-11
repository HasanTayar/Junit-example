package com.example;
import com.example.User;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter user name:");
        String name = in.next();
        System.out.println("Enter user age :");
        int age = in.nextInt();
        User user = createUser(name, age);
        System.out.println("User created successfully with name: "+user.getName() + "\n and age:" +user.getAge());
        in.close();
    }

    public static User createUser(String name, int age) {
        return new User(name, age);
    }
}
