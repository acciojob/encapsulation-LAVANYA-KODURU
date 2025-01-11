package src;
public class Main {
  public static void main(String[] args){
    RWOnly obj = new RWOnly();
    //to check error
    //obj.name="Test"; 
    obj.setName("Lavanya");
    System.out.println("Name: "+obj.getName());
  }
}
