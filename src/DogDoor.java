// The dog door main class
public class DogDoor {

    private boolean open;

    // A constructor that create a new door and init it to false
    public DogDoor(){
        this.open = false;
    }

    public void open(){
        System.out.println("The dog door opens ");
        this.open = true;
    }

    public void close(){
        System.out.println("The dog door close ");
        this.open = false;
    }

    public boolean isOpen(){
        return open;
    }



}
