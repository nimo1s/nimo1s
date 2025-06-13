class Superclass { 
    int i =20; 
    void display() { 
        System.out.println(“Superclass display method”);
    }
}
class Subclass extends Superclass {
    @Override
    int i = 100; 
    void display() {
        super.display();
        System.out.println(“Subclass display method”);
        System.out.println(“ i value =”+i);
        System.out.println(“superclass i value =”+super.i);
    } 
} 
class SuperUse { 
    public static void main(String args[]){ 
        Subclass obj = new Subclass();
        obj.display(); 
    } 
}