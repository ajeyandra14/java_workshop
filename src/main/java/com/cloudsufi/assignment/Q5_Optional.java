package com.cloudsufi.assignment;

import java.util.Optional;

public class Q5_Optional {
    record User(String name, boolean isActive) {}

    static Optional<User> findUser(String id) {
        return switch (id) {
            case "1" -> Optional.of(new User("Vedanshu", true));  // Active
            case "2" -> Optional.of(new User("Harsh", false));   // Inactive
            default  -> Optional.empty();  // Not Found
        };
    }

    static void processUser(String id) {
        findUser(id)
                .filter(User::isActive)
                .map(User::name)
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.println("User not found")
                );
    }

    public static void main(String[] args) {
        processUser("1");
        processUser("2");
        processUser("3");
    }
}
