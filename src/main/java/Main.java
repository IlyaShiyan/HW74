import java.time.LocalDateTime;

class MyThread implements  Runnable{
    @Override
    public void run() {
        System.out.println(LocalDateTime.now());
    }
}

public class Main {
    public static void main(String[] args) {

        Thread thread = new Thread(new MyThread());
        thread.start();

    }
}
