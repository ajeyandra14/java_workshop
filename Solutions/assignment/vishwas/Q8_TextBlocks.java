package assignment.vishwas;

public class Q8_TextBlocks {
    public static void main(String[] args) {
        String userId = "U3012";

        String query = """
            Select
                id,
                username,
                email,
                status
            FROM users
            WHERE id='%s'
              AND status = 'ACTIVE'
            ORDER BY username
        """.formatted(userId);

        System.out.println(query);
    }
}
