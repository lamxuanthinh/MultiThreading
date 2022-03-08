package MultiThreading;

public class TriangleArea extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            double height = Math.abs(Math.pow(i,2) + Math.pow(i/2,2));
            System.out.println("Triangle Area is : " + (i * height) / 2);
        }
    }
}
