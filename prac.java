public class Main{
public static void main(String[] args){
  MyThreadA j = new Thread();
  MyThreadB s = new Thread();
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
