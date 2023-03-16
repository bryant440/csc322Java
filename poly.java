class public Main{
public static void main(String[] args){
RunA wolf = new RunA("No Hook");
Thread x = Thread(wolf);
  
}
  
 class RunA implements Runnable{
 String name;

   RunA(String a){
   this.name = a;
   }
 } 
}
