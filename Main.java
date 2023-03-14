//THE FIRST EXAMPLE: CREATING MULT-THREADS USING DIFF CLASSES BY EXTENDING THREAD CLASS
public class Main {
    public static void main(String[] args) {
        ThreadA ta = new ThreadA();
        ThreadB tb = new ThreadB();
        ThreadC tc = new ThreadC();

        ta.start();
        tb.start();
        tc.start();
    }
}

class ThreadA extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("ThreadA: " + i); // replace i with (i*2) to get even numbers
        }
    }
}

class ThreadB extends Thread {
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("ThreadB: " + j); // replace j with (j*2-1) to get odd numbers
        }
    }
}

class ThreadC extends Thread {
    public void run() {
        for (int k = 1; k <= 5; k++) {
            System.out.println("ThreadC: " + k);
        }
    }
}