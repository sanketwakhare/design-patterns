package designbird.vfinal;

// Requirements:
// 5 birds
//        Pigeon
//        Crow
//        Sparrow
//        Ostrich
//        Penguin
//
// Penguin and Ostrich don't fly, everyone else flies
// Crows and sparrows fly in the same way
// Every bird can eat and make sound

import lombok.Data;

@Data
abstract public class Bird {

    // type of bird
    String type;

    public Bird(String type) {
        this.type = type;
    }

    abstract public void eat();

    abstract public void makeSound();
}
