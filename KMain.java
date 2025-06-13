class Main { 
    public void eat()
    {
        System.out.println("I can eat"); 
    } 
    void bark(){
        System.out.println("hello dog");
    }
    
} 
class Dog extends Main { 
   @Override 
    public void eat()
    { 
       
        System.out.println("I eat dog food");
    super.eat();    
    } 
    public void bark()
    { 
        super.bark();
        System.out.println("I can bark");
    } 
} 
class KMain {
    public static void main(String[] args) 
    { 
        Dog labrador = new Dog(); 
        labrador.eat(); 
        labrador.bark(); 
    } 
} 