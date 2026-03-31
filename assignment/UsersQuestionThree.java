import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UsersQuestionThree {
    public static void main(String[] args) {


        List<User> users = new ArrayList<>(Arrays.asList(
                new User("Ansh", 25,"123",true),
                new User("Test1", 15,"124",true),
                new User("Test2", 30,"125",true)
        ));

        List<User> result = User.usersMeetingCriteria(users);
        System.out.println("Meeting Criteria:");
        for (User u : result) {
            System.out.println("Name: " + u.name + " | Age: " + u.age);
        }

    }
}
