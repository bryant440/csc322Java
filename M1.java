public class M1{
    public static void  main(String []args){
     MyThread m=new MyThread("Sharkz");
      Thread t=new Thread(m);
      t.start();
  }
}
class MyThread implements Runnable{
    String name;
     MyThread(String n){
     this.name=n;
    }
    
    public void run(){
      System.out.println(name);
   }
}
