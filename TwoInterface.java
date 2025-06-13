interface Printable {
    void print();
}
interface Showable {
    void nimoo();
}
interface nimo{
   void show();
}
class Comp implements Printable ,Showable{             
 public    void print()
    {
        System.out.println("printable");
    }
public     void nimoo ()
    {
        System.out.println("showable");
    }
    void show()
    {
        System.out.println("nimoo");
    }
}
   class TwoInterface {
       public static void main(String[] args)
       {
         Comp c=new Comp();
           c.print();
           c.show();
           c.nimoo();
       }
    
}