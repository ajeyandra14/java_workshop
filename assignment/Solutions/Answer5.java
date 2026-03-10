package Solutions;
import java.util.Optional;

class User_{
    private String id;
    private String username;
    private boolean active;

    public User_(String id, String username, boolean active){
        this.id = id;
        this.username = username;
        this.active = active;
    }

    public String getId(){
        return id;
    }

    public String getUsername(){
        return username;
    }

    public boolean isActive(){
        return active;
    }
}

public class Answer5 {
    public static Optional<User_> findUser(String id){
        User_ user1 = new User_("1001", "Karan", true);
        User_ user2 = new User_("1002", "Rahul", false);

        if(user1.getId().equals(id)) {
            return Optional.of(user1);
        }
        if(user2.getId().equals(id)) {
            return Optional.of(user2);
        }

        return Optional.empty();
    }

    public static void main(String[] args) {

        String id = "1002";
        findUser(id)
                .filter(User_::isActive)
                .map(User_::getUsername)
                .ifPresentOrElse(System.out::println, () -> System.out.println("User not found"));
    }
}
