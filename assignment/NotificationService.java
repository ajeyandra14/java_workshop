
// Solution to Question 1 , Sir I have assumed that the message is what the error would be and the tries are current tries so i simply incremented the count as the context is not given in the question and after that calling in send again;
interface NotificationService {
    void send(String message);

    default void sendWithRetry(String message, int retries){
        String printer=message + "you already have attempted these many tries" + retries +1;
        send(printer);

    }
}