// ques 5
import java.util.*;

class UserInfo {
    String name;
    String id;
    boolean isActive;

    UserInfo(String name,String id,boolean isActive){
        this.name=name;
        this.id=id;
        this.isActive=isActive;
    }
    public String getId() { return id; }
    public String getUsername() { return name; }
    public boolean isActive() { return isActive; }
}

public class ActiveUser {
    public static final List<UserInfo> userList = Arrays.asList(
            new UserInfo("smriti","1",true),
            new UserInfo("shruti","2",false)
    );

    public static Optional<UserInfo> findUser(String id){
        return userList.stream()
                .filter(user->user.getId().equals(id))
                .findFirst();
    }

    public static void processUser(String id){
        System.out.println("processing user "+id+ ":");

        findUser(id).filter(UserInfo::isActive).map(UserInfo::getUsername).ifPresentOrElse(System.out::println,
                ()->System.out.println("User not found"));
    }
    public static void main(String[] args) {
        processUser("1");
        processUser("2");
        processUser("3");
    }

}
