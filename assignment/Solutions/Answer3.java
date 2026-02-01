package Solutions;

import java.util.List;
import java.util.stream.Collectors;

class User{
    String name;
    int age;

    User(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}

public class Answer3 {
    public static void main(String[] args) {
        User user1 = new User("Aman", 21);
        User user2 = new User("Shreyas", 22);
        User user3 = new User("Ankit", 17);
        User user4 = new User("Amit", 23);

        List<User> users = List.of(user1, user2, user3, user4);

        List<String> result = users.stream()
                .filter(u -> u.getAge() >= 18)
                .map(u -> u.getName().toUpperCase())
                .sorted()
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
