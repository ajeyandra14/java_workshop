import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

class User {
    String name;
    int age;
    String id;
    Boolean isActive;

    public User(String name, int age, String id, Boolean isActive) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.isActive = isActive;
    }

    public static List<User> usersMeetingCriteria(List<User> unfilteredList){

        List<User> filteredList = unfilteredList.stream().filter(a->a.age>18).map(u -> {
            u.name = u.name.toUpperCase();
            return u;
        }).sorted(Comparator.comparing(u -> u.name)).collect(Collectors.toList());
        return filteredList;
    }

   public static Optional<User> findUser(String id) {
       if ("123".equals(id)) {
           return Optional.of(new User("Ansh", 12,"123",true));
       } else if ("456".equals(id)) {
           return Optional.of(new User("Test1",12,"124", false));
       }
       return Optional.empty();
   }


}