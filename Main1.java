//THE SECOND EXAMPLE: CREATING MULT-THREADS USING MULTIPLE INSTANCES OF THE SAME CLASS
// BY EXTENDING THREAD CLASS
public class Main1 {
    public static void main(String[] args) {
        MyThread m1 = new MyThread("ckj");
        MyThread m2 = new MyThread("rcl");
        MyThread m3 = new MyThread("lwr");

        m1.start();
        m2.start();
        m3.start();

    }
}

class MyThread extends Thread {
    String name;

    MyThread(String n) {
        this.name = n;
    }

    public void run() {
        System.out.println(name);
    }
}