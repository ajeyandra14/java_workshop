import java.util.Optional;

class User {
    String name;
    boolean active;

    User(String name, boolean active) {
        this.name = name;
        this.active = active;
    }
}

public class OptionalDemo {

    static Optional<User> findUser(String id) {
        return Optional.of(new User("Yashas", true));
    }

    public static void main(String[] args) {

        findUser("101")
            .filter(u -> u.active)
            .ifPresentOrElse(
                u -> System.out.println(u.name),
                () -> System.out.println("User not found")
            );
    }
}
