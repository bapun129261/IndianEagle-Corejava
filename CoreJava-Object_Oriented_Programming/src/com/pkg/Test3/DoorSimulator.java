package com.pkg.Test3;

public class DoorSimulator {
    public static void main(String[] args) {
       /* Remote remote=new Remote(new DogDoor());
        remote.pressButton();*/
        DogDoor dogDoor = new DogDoor();
        dogDoor.addAllowBark(new Bark("woof"));
        dogDoor.addAllowBark(new Bark("Rowlf"));
        dogDoor.addAllowBark(new Bark("Arooo"));
        dogDoor.addAllowBark(new Bark("yip"));

        BarkRecognizer recognizer = new BarkRecognizer(dogDoor);
        recognizer.voiceRecognizer(new Bark("Arooo"));


    }
}
