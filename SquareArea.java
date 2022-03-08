package MultiThreading;

public class SquareArea extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Square Area is : " + (i * i));
        }
    }
}
