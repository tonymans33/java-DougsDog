public class DogDoorSimulator {
    public static void main(String[] args) {

        DogDoor door = new DogDoor();
        Remote remote = new Remote(door);

        System.out.println("Fido barks to go outside .. \n");
        remote.pressButton();
        System.out.println("Fido has gone outside .. \n");
        System.out.println("Fido's all done.. \n");
        try {
            Thread.sleep(10000);
        }catch (InterruptedException e){ }

        System.out.println(".. but he's stuck outside! \n");
        System.out.println("Fido starts barking \n");
        System.out.println("Gina grabs the remote and press the button \n");
        remote.pressButton();

        System.out.println("Fido barks inside.. \n");
    }
}
