package practise;

/* Prototype design Pattern */

public class Main {
    public static void main(String[] args) {
        Eagle eagle = new Eagle("Eagle");
        eagle.setSound("kra");
        System.out.println(eagle);

        try {
            Eagle eagleCopy = (Eagle) eagle.clone();
            System.out.println(eagleCopy);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
