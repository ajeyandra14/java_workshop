package assignment.vishwas;

public class Q1_NotificationService {

    interface NotificationService{
        void send(String message);

        default void sendWithRetry(String message,int retries){  // Used for Backward Compatibility
            if(retries<0){
                throw new IllegalArgumentException("Retry count cannot be negative.");
            }
            for(int attempt=1;attempt<=retries+1;attempt++){ // First Attempt + Additional attempts after failure
                try {
                    send(message);
                    System.out.println("Message sent on attempt: " + attempt);
                    return;
                }
                catch (Exception e) {
                    if(attempt>retries){
                        throw new RuntimeException("Failed sending message.");
                    }
                }

            }
        }
    }

    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService() {
            @Override
            public void send(String message) {
                if(message==null){
                    throw new RuntimeException("Message cannot be null.");
                }
                System.out.println("Sending message: " + message);
            }
        };
        notificationService.sendWithRetry("Hello Cloudsufi!",3);
    }
}
