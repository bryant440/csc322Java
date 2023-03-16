public class Main{
public static void main(String[] args){
  MyThreadA j = new MyThreadA();
  MyThreadB s = new MyThreadB();
  j.start();
  s.start();
    
 class MyThreadA extends Thread{
 public void run(){
 System.out.println("Whatever");
 }
   
 }
  class MyThreadB extends Thread{
  public void run(){
    System.out.println("kacey");
   } 
  }
}
//note that threads are usually extended whereas classes are implemneted.
