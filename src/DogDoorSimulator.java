public class DogDoorSimulator {
    public static void main(String[] args) {

        DogDoor door = new DogDoor();
        Remote remote = new Remote(door);

        System.out.println("Fido parks to go outside ..");
        remote.pressButton();
        System.out.println("\n Fido has gone outside ..");
        remote.pressButton();
        System.out.println("\n Fido's all done..");
        remote.pressButton();
        System.out.println("\n Fido parks inside..");
        remote.pressButton();
    }
}
