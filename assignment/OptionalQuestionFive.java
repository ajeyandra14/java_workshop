import java.util.Optional;

class OptionalQuestionFive{
  public void findAndPrintUser(String id){
      Optional<User> userOpt=User.findUser(id);

      userOpt.ifPresentOrElse(
              user-> {
                  if (user.isActive) {
                      System.out.println(user.name);
                  }
                  else {
                      System.out.println("User Inactive");
                  }
              },
              ()-> System.out.println("User Not Found"));
              }


    public static void main(String[] args) {
        OptionalQuestionFive app = new OptionalQuestionFive();

        System.out.print("Testing ID 123: ");
        app.findAndPrintUser("123");

        System.out.print("Testing ID 456: ");
        app.findAndPrintUser("456");

        System.out.print("Testing ID 999: ");
        app.findAndPrintUser("999");
    }







}