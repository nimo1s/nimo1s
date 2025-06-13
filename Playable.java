
    // Playable.java
// Declare the Playable interface
interface Main {
    // Declare the abstract method "play" that classes implementing this interface must provide
    void play();
}
//Football.java
class Football implements Main {
  public void play() {
    System.out.println("Playing football");
    // Add code to play football
  }
}
// Volleyball.java

// Declare the Volleyball class, which implements the Playable interface
class Volleyball implements Main {
    // Implement the "play" method required by the Playable interface
    public void play() {
        // Print a message indicating that volleyball is being played
        System.out.println("Playing volleyball");
        // Additional code to play volleyball can be added here
    }
}
// Basketball.java

// Declare the Basketball class, which implements the Playable interface
class Basketball implements Main {
    // Implement the "play" method required by the Playable interface
    public void play() {
        // Print a message indicating that basketball is being played
        System.out.println("Playing basketball");
        // Additional code to play basketball can be added here
    }
} 
// Main.java

// Declare the Main class
 class Playable {
    public static void main(String[] args) {
        // Create instances of Playable objects for football, volleyball, and basketball
        Main football = new Football();
        Main volleyball = new Volleyball();
        Main basketball = new Basketball();

        // Call the "play" method on each Playable object to play different sports
        football.play();
        volleyball.play();
        basketball.play();
    }
}

    
