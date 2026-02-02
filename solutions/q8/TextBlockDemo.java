public class TextBlockDemo {
    public static void main(String[] args) {

        String userId = "101";

        String query = """
            SELECT *
            FROM users
            WHERE user_id = '%s'
            AND active = true;
            """.formatted(userId);

        System.out.println(query);
    }
}
