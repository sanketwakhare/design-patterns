package designbird.v2;


import lombok.Data;

/**
 * v2 design of class Bird
 * <p>
 * create FlyableBird and nonFlyableBird classes
 * <p>
 * <b>Problems :</b>
 * what if some birds can eat and some cannot eat ?
 * what if some birds can make sound and some cannot make sound ?
 * <p>
 * you will end up creating multiple classes
 * e.g. below 8 classes are required to support the behaviour. this problem is called <b>class explosion</b>
 * FlyableEatableSoundMakerBird
 * FlyableEatableNonSoundMakerBird
 * FlyableNonEatableSoundMakerBird
 * FlyableNonEatableNonSoundMakerBird
 * NonFlyableEatableSoundMakerBird
 * NonFlyableEatableNonSoundMakerBird
 * NonFlyableNonEatableSoundMakerBird
 * NonFlyableNonEatableNonSoundMakerBird
 */

@Data
public abstract class Bird {

    private final String type;
    private int weight;
    private String color;
    private int size;
    private String beakType;

    public Bird(String type) {
        this.type = type;
    }
}

