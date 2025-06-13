
interface Main {
    void print();
}
class Printer implements Main {          
  public  void print()
    {
        System.out.println("Hello World");
    }
    
}
  class Printable {
    public static void main(String[] args){
        Main nimo =new Printer();
        nimo.print();
    }
}