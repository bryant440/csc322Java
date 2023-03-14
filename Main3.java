//THE SECOND EXAMPLE: CREATING MULT-THREADS USING MULTIPLE INSTANCES OF THE SAME CLASS
// BY IMPLEMENTING RUNNABLE CLASS
public class Main3 {
    public static void main(String[] args) {
        MyThread ta = new MyThread("ckj");
        MyThread tb = new MyThread("rlc");
        MyThread tc = new MyThread("rlw");

        Thread a = new Thread(ta);
        Thread b = new Thread(tb);
        Thread c = new Thread(tc);

        a.start();
        b.start();
        c.start();
    }

}

class MyThread implements Runnable {
    String name;

    MyThread(String n) {
        this.name = n;
    }

    public void run() {
        System.out.println(name);
    }
}