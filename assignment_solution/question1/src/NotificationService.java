

public interface NotificationService {
    void send(String message);
    default void sendWithRetry(String message, int retries){
        while(retries>0){
            retries--;
            send(message);
        }
    }


}
