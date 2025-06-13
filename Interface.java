interface Printable{  
    void print();  
}    
interface Showable extends Printable{    
    void show();  
}  
class Main implements Showable{  
    public void print()
    {
        System.out.println("Hello");
    }   
    public void show()
    {
        System.out.println("Welcome");
    }
}
   class Interface{ 
    public static void main(String[] args)
    {   
        Main obj = new Main();  
        obj.print();   
        obj.show();    
    }  
}   
