package computerbuilder;

public class Main {
    public static void main(String[] args) {
        Computer computer = Computer.getBuilder()
                .setRam("16GB")
                .setHdd("1TB")
                .setUsbPorts(3)
                .setBluetoothSupported(true)
                .setWifiSupported(true)
                .setGraphicsCardSupported(true)
                .build();
        System.out.println(computer);
        Computer computer1 = Computer.getBuilder().build();
        System.out.println(computer1);
    }
}
