package MultiThreading;

public class main {
    public static void main(String[] args) {
        SquareArea square = new SquareArea();
        square.start();
        try {
            square.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        CircleArea circle = new CircleArea();
        circle.start();
        try {
            circle.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        TriangleArea triangle = new TriangleArea();
        triangle.start();
        try {
            triangle.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
