package com.cloudsufi.assignment;

public class Q8_TextBlocks {
    public static void main(String[] args) {
        int userId = 101;

        String query = """
            SELECT id, name, email
            FROM users
            WHERE id = %d
            ORDER BY created_at DESC
        """.formatted(userId);

        System.out.println(query);
    }
}
