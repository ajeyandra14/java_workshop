import java.sql.SQLOutput;
import java.util.Scanner;

public class SqlQuestionEight {
    String sql(int userId){
        return """
                select u.age,
                u.name
                from users u
                where u.id=%d
                and u.isActive=true;
                """.formatted(userId);
    }

    public static void main(String[] args) {
        SqlQuestionEight obj=new SqlQuestionEight();
        Scanner sc=new Scanner(System.in);
        int id=sc.nextInt();
        System.out.println(obj.sql(id));
    }


}
