//ques 3
import java.util.*;
import java.util.stream.Collectors;

class User{
    String name;
    int age;

    User(String name, int age){
        this.name=name;
        this.age=age;
    }
}

public class SortedUsers {
    public static void main(String[] args){
        List<User> users = List.of(
                new User("smriti",22),
                new User("shruti",12),
                new User("alex",23),
                new User("bob",14),
                new User("candice",20)

        );

        List<String> output = users.stream()
                .filter(u->u.age>=18)
                .map(u->u.name.toUpperCase())
                .sorted()
                .collect(Collectors.toList());

        System.out.println(output);
    }
}
