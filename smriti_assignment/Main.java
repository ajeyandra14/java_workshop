//Ques 1

interface NotificationService{
    void send(String message);

    default void sendWithRetry(String message ,int retries){
        int attempt=0;
        while(attempt<=retries){
            try{
                send(message);
                System.out.println("message sent :" +message);
                return;
            }catch(Exception e){
                attempt++;
                System.out.println("attempt"+attempt+"got failed"+e.getMessage());
                if(attempt>retries){
                    System.out.println("the attempt limit is exhausted");
                }
            }
        }
    }
}

public class Main {
    public static void main(String[] args){
        NotificationService nfs = new NotificationService() {
            @Override
            public void send(String message) {
                System.out.println("let's send a message");

            }
        };

        nfs.sendWithRetry("this is my first message",5);
    }
}
