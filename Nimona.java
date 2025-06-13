
class Boru {int roomNo;String roomType;float roomArea;boolean acMachine;public void SetData(int rno, String rt, float area, boolean ac){roomNo = rno;roomType = rt;roomArea = area;acMachine = ac;}public void displayData(){System.out.println(“The room #. Is ” + rno);
    System.out.println (“The room Type is ” + rt);
    System.out.println (“The room area is ”+ area);
    System.out.println (“The A/c Machine needed ” + ac);
}
 }
      class Nimona {
         public static void main(String[] arg){ Boru room1 = new Boru();
room1. SetData (101, “Deluxe”, 240.0f, true);
room1.displayData();
        
    }  
}