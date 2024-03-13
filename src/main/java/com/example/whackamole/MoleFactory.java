package com.example.whackamole;

import javafx.scene.image.Image;

public class MoleFactory {
    private static Image
        mole1 = new Image("file:src/main/resources/com/example/whackamole/mole1.png"),
        mole2 = new Image("file:src/main/resources/com/example/whackamole/mole2.png");

    private MoleFactory(){}
    public static Mole getMole(int picker){
            Mole mole = null;
        switch(picker){
            case 1:
                mole = new Mole(mole1);
                break;
            case 2:
                mole = new SuperMole(mole2);
                break;

        }
        return mole;
    }

}
