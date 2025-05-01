package Lesson_12;

public class Example {
    public static void main(String[] args) {

        SummaNumbers summaNumbers = new SummaNumbers();
        SortNumbers sortNumbers = new SortNumbers();
        Thread thread = new Thread(new ThreeThread());

        thread.start();
        summaNumbers.start();
        sortNumbers.start();

    }

    static class SummaNumbers extends Thread {

        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                Thread.currentThread().setName("Plus - ");

                System.out.println(Thread.currentThread().getName() + i);
            }
        }
    }

    static class SortNumbers extends Thread {
        @Override
        public void run() {
            for (int i = 1000; i > 0; i--) {
                Thread.currentThread().setName("Minus - ");
                System.out.println(Thread.currentThread().getName() + i);
            }
        }
    }

    static class ThreeThread implements Runnable{
        @Override
        public void run() {
            for (int i = 0; i < 2000; i++) {
                Thread.currentThread().setName("Three Thread - ");
                System.out.println(Thread.currentThread().getName() + i);

            }
        }
    }
}
