class nimo  { 
    public void show()
    { 
        System.out.println("I am grandfather.");
    }  
}  
class Father extends nimo  { 
    public void show()
    { 
        System.out.println("I am father."); 
    }  
}  
class Son extends Father  { 
    public void show() 
    {  
        System.out.println("I am son."); 
    }  
}  
public class Daughter extends Father  { 
    public void show() 
    {  
        System.out.println("I am daughter."); 
    } 
}
public class GrandFather{
    public static void main(String args[]) 
    {  	
        Daughter obj = new Daughter(); 
        obj.show(); 
    }  
}  