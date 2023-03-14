//THE THIRD EXAMPLE: CREATING MULT-THREADS USING DIFF CLASSES BY IMPLEMENTING RUNNABLE
public class Main2 {
    public static void main(String[] args) {
        ThreadA ta = new ThreadA();
        ThreadB tb = new ThreadB();
        ThreadC tc = new ThreadC();

        Thread a = new Thread(ta);
        Thread b = new Thread(tb);
        Thread c = new Thread(tc);

        a.start();
        b.start();
        c.start();
    }
}

class ThreadA implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("ThreadA: " + i); // replace i with (i*2) to get even numbers
        }
    }
}

class ThreadB implements Runnable {
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("ThreadB: " + j); // replace j with (j*2-1) to get odd numbers
        }
    }
}

class ThreadC implements Runnable {
    public void run() {
        for (int k = 1; k <= 5; k++) {
            System.out.println("ThreadC: " + k);
        }
    }
}