package Solutions;

public class Answer8 {
    public static void main(String[] args) {
        int studentId = 101;

        String sqlQuery =
              """
              SELECT id, name, email, course, gpa, enroll_date
              FROM students
              WHERE id = %d AND gpa >= 6.0
              ORDER BY enroll_date
              """.formatted(studentId);

        System.out.println(sqlQuery);
    }
}
