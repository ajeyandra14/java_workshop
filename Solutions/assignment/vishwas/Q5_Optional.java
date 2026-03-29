package assignment.vishwas;

import java.util.Optional;

public class Q5_Optional {
    record User(String username, boolean isActive) {}

    static Optional <User> findUser(String id) {
        if("101".equals(id)){
            return Optional.of(new User("vishwas",true));
        } else if ("102".equals(id)) {
            return Optional.of(new User("keshav",false));
        }
        else return Optional.empty();
    }
    static void userProcessor(String id){
        findUser(id)
                .filter(User::isActive)
                .map(User::username)
                .ifPresentOrElse(System.out::println,()-> System.out.println("User not found"));

    }
    static void main(String[] args) {
        userProcessor("101");
        userProcessor("102");
        userProcessor("104");
    }
}
