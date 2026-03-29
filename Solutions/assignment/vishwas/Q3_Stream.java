package assignment.vishwas;
import java.util.List;

public class Q3_Stream {
    static class User {
        String name;
        int age;
        public User(String name,int age){
            this.name=name;
            this.age=age;
        }
    }

    static void main(String[] args) {
        List<User> users = List.of(
                new User("Vishwas",22),
                new User("Aakash",21),
                new User("Himani",23)
        );

        List <String> filteredAndSorted = users.stream()
                .filter(user->user.age>18)
                .map(user -> user.name.toUpperCase())
                .sorted()
                .toList();
        System.out.println(filteredAndSorted);
    }
}
