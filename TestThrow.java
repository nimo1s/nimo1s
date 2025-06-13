
class Nimo {
        public void checkNum(int num) 
        {  
            if(num < 1)
            {  
                throw new ArithmeticException("\nNumber is negative, cannot calculate square");   
            }
            else 
            {        
                System.out.println("Square of " + num + " is " + (num*num));   
            }   
        } 
}
   class TestThrow{ 
        public static void main(String[] args)
        {    
            Nimo obj = new Nimo();      
            obj.checkNum(-3);     
            System.out.println("Rest of the code..");   
        }  
    }
    
     