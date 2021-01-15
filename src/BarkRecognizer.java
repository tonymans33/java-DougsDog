public class BarkRecognizer {

    private DogDoor door;

    public BarkRecognizer(DogDoor door){
        this.door = door;
    }

    public void recognize(Bark bark){
        System.out.println("Bark Recognizer heard a ' " + bark + " ' ");
        if(door.getAllowedBark().equals(bark)){
            door.open();
        }else {
            System.out.println("Bark is not allowed");
        }
    }

}
