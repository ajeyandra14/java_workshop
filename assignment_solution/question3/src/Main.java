import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<User> usersList = new ArrayList<>(List.of(new User("rohan",37),
                                                    new User("sohan",28),
                                                    new User("mohan",21),
                                                    new User("harry",17)));

        List<User> newList = usersList.stream()
                .filter(u-> u.age()>=18)
                .map(u-> new User(u.name().toUpperCase(),u.age()))
                .sorted(Comparator.comparing(User::name))
                .toList();

        newList.forEach(System.out::println);


    }
}