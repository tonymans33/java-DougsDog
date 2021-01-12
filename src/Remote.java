// Remote class to make the man and wife control the door remotely
public class Remote {

    private DogDoor door;

    // Remote constructor to give the remote a door to control
    public Remote(DogDoor door){
        this.door = door;
    }

    // A method to control pressing the button if will open or close the door
    public void pressButton(){
        System.out.println("Pressing the remote control button ...");
        if(door.isOpen()){
            door.close();
        }else {
            door.open();
        }

    }

}
