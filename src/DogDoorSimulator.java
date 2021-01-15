public class DogDoorSimulator {
    public static void main(String[] args) {

        DogDoor door = new DogDoor();
        BarkRecognizer recognizer = new BarkRecognizer(door);
        Remote remote = new Remote(door);
        door.addAllowedBarks(new Bark("woof"));
        door.addAllowedBarks(new Bark("wloof"));
        door.addAllowedBarks(new Bark("aloof"));

        System.out.println("Fido barks to go outside .. \n");
//        remote.pressButton();
        recognizer.recognize(new Bark("kkk"));

        System.out.println("Fido has gone outside .. \n");
        System.out.println("Fido's all done.. \n");

        try {
            Thread.sleep(10000);
        }catch (InterruptedException e){ }

        System.out.println(".. but he's stuck outside! \n");
        System.out.println("Fido starts barking \n");
//        System.out.println("Gina grabs the remote and press the button \n");
//        remote.pressButton();
        recognizer.recognize(new Bark("woof"));


        System.out.println("Fido barks inside.. \n");
    }
}
