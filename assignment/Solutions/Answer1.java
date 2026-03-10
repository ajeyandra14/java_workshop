package Solutions;

interface NotificationService{
    void send(String message);

    default void sendWithRetry(String message, int retries){
        for(int i = 0; i < retries; i++) send(message);
    }
}

class EmailNotificationService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Sending email : " + message);
    }
}

public class Answer1{
    public static void main(String[] args) {
        NotificationService service = new EmailNotificationService();
        service.sendWithRetry("Hi from Karan", 5);
    }
}