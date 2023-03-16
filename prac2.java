public class Main{
public static void main(String[] args){

  RunA a = new RunA();
  RunB s = new RunB();
   
  Thread ace = Thread(a);
  Thread spades = Thread(s);
  
  ace.start();
  spades.start();
  
}
  
  class RunA implements Runnable{
  public void run(){
  System.out.println('Forever');
    
  }
    
  }
  class RunB implements Runnable{
  public void run(){
  
  System.out.println('kacey')}
  }
}
