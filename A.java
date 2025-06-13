
 class Main {
 public   void F1(){
        System.out.print("FA\n");
    }
    void F2(){
        System.out.print("FA1\n");
    }
 }
    class Child extends Main {
        void F2(){
            System.out.print("f1\n");
        }
    public   void F1(){
           System.out.println("what is your name"); 
        }
    }
    class A {
        public static void main(String args[]){
            Main oa =new Main();
            oa.F2();
            oa.F1();
           // oa.F3();
            Child ch =new Child();
            ch.F2();
        
    }
}