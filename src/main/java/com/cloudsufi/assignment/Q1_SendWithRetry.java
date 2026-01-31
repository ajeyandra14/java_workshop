package com.cloudsufi.assignment;

public class Q1_SendWithRetry {

    interface NotificationService {
        void send(String message);

        default void sendWithRetry(String message, int retries) {
            for (int i = 0; i <= retries; i++) {
                try {
                    send(message);
                    return; // success
                } catch (RuntimeException e) {
                    if (i == retries) {
                        throw e;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        NotificationService service = new NotificationService() {
            int attempts = 0;

            @Override
            public void send(String message) {
                attempts++;
                if (attempts == 1) {
                    throw new RuntimeException("Temporary Glitch");
                }
                System.out.println("Email sent successfully on attempt " + attempts);
            }
        };

        service.sendWithRetry("Important Update", 3);
    }
}
