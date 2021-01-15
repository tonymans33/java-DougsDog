public class Bark {

    private String sound;

    public Bark(String sound){
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public boolean equals(Bark bark){

        if (bark instanceof Bark){ // Making sure that the given objet is an instance of the Bark class

            Bark otherBark = (Bark)bark; // Creating other bark object

            if(this.sound.equalsIgnoreCase(otherBark.sound)){ // Check if the given object equals the init bark
                return true;
            }

        }
        return false;
    }
}
