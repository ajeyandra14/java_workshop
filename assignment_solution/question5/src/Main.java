import java.util.Optional;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static Optional<User> findUser(String id){
        return Optional.of(new User("Shubhanshu",true));
    }

    public static void main(String[] args) {


        findUser("2")
        .filter(User::active)
        .ifPresentOrElse(
                user -> System.out.println(user.username()),
                () -> System.out.println("User not found")
        );



    }
}