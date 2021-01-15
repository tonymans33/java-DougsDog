import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

// The dog door main class
public class DogDoor {

    private boolean open;
    private List<Bark> allowedBarks = new ArrayList<Bark>();

    // A constructor that create a new door and init it to false
    public DogDoor(){
        this.open = false;
    }

    public void addAllowedBarks(Bark allowedBark) {
        allowedBarks.add(allowedBark);
    }

    public List<Bark> getAllowedBarks() {
        return allowedBarks;
    }

    public void open(){
        System.out.println("The dog door opens ");
        this.open = true;

        // After opening the door, wait 5 sec and then close it automatically
        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                close();
                timer.cancel();
            }
        }, 5000);
    }

    public void close(){
        System.out.println("The dog door close ");
        this.open = false;
    }

    public boolean isOpen(){
        return open;
    }



}
