class Parent { 
   void show()
    {
        System.out.println("show from Parent "); 
    }
    void display() 
    { 
        System.out.println("display from Parent");
    } 
} 
class Child extends Parent { 
   //public void show()
 //  { 
  //    System.out.println("show from Child "); 
//  }
   void display() 
 {
        System.out.println("display from Child"); 
    } 
    public void run()
    {
        System.out.println("run from child");
    }
} 
public class MainClass {
    public static void main(String []arg)
    {
        Parent p = new Child(); 
        p.show();
        p.display(); 
   //    p.run();
       System.out.println("\n");
      Child ch =(Child)p;
    ch.show();
      ch.display();
     ch.run(); //valid
        
       Child ch = new Child(); 
        ch.show("*******");
       ch.display();
    } 
} 