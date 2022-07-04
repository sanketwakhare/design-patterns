package designbird.v5;

import lombok.Data;

/**
 * v5 design of class Bird
 * follow SRP -> Single Responsibility Principle
 * follows OCP -> open for extension and closed for modifications
 * follows LSP -> future types can be easily substituted with another object without any changes in existing classes
 * follows ISP -> each interface is functional interface
 * follows DI -> Dependency Inversion -> as dependency between 2 concrete classes is added via interface
 * Dependency of one concrete class is injected via constructor
 */

@Data
public abstract class Bird {

    private String type;
    private String weight;
    private String color;
    private String size;
    private String beakType;

    public Bird(String type) {
        this.type = type;
    }
}
