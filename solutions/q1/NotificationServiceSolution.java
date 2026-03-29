interface NotificationService {
    void send(String message);

    default void sendWithRetry(String message, int retries) {
        int attempts = 0;
        while (attempts < retries) {
            try {
                send(message);
                return;
            } catch (Exception e) {
                attempts++;
            }
        }
        throw new RuntimeException("Failed after retries");
    }
}
