import java.util.List;

class User {
    String name;
    int age;

    User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class UserStreamExample {
    public static void main(String[] args) {

        List<User> users = List.of(
            new User("Yashas", 21),
            new User("Rohan", 20),
            new User("Rahul", 24)
        );

        List<String> result =
            users.stream()
                 .filter(u -> u.age >= 18)
                 .map(u -> u.name.toUpperCase())
                 .sorted()
                 .toList();

        result.forEach(System.out::println);
    }
}
