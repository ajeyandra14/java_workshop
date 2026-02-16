//ques 8

public class SQLQuery {
    public static void main(String[] args){
        int userId= 102;

        String sql = """
                SELECT id , name, department
                FROM employee 
                WHERE salary >5000
                ORDER BY asc;
                """;
        String result = sql.formatted(userId);
        System.out.println("the query :\n"+result);
    }
}
