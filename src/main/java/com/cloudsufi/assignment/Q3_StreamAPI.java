package com.cloudsufi.assignment;

import java.util.List;

public class Q3_StreamAPI {

    static class User {
        String name;
        int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        List<User> users = List.of(new User("Vedanshu", 21), new User("Harsh", 23), new User("Anushka", 16));

        List<String> processedNames = users.stream()
                .filter(user -> user.age >= 18)
                .map(user -> user.name.toUpperCase())
                .sorted()
                .toList();

        System.out.println(processedNames);
    }
}
