package computerbuilder;

import java.security.InvalidParameterException;
import java.util.Objects;

public class Computer {
    private String ram;
    private String hdd;
    private int usbPorts;
    private boolean isBluetoothSupported;
    private boolean isGraphicsCardSupported;
    private boolean isWifiSupported;

    private Computer() {
    }

    private Computer(Builder builder) {
        this.ram = builder.ram;
        this.hdd = builder.hdd;
        this.usbPorts = builder.usbPorts;
        this.isBluetoothSupported = builder.isBluetoothSupported;
        this.isGraphicsCardSupported = builder.isGraphicsCardSupported;
        this.isWifiSupported = builder.isWifiSupported;
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public String getRam() {
        return ram;
    }

    public String getHdd() {
        return hdd;
    }

    public int getUsbPorts() {
        return usbPorts;
    }

    public boolean isBluetoothSupported() {
        return isBluetoothSupported;
    }

    public boolean isGraphicsCardSupported() {
        return isGraphicsCardSupported;
    }

    public boolean isWifiSupported() {
        return isWifiSupported;
    }

    public static class Builder {
        private String ram;
        private String hdd;
        private boolean isBluetoothSupported;
        private boolean isGraphicsCardSupported;
        private int usbPorts;
        private boolean isWifiSupported;


        public Computer build() {
            // validation
            validate(ram, "ram");
            validate(hdd, "hdd");
            validate(usbPorts, "usbPorts");
            validate(isBluetoothSupported, "isBluetoothSupported");
            validate(isGraphicsCardSupported, "isGraphicsCardSupported");
            validate(isWifiSupported, "isWifiSupported");
            // object creation
            return new Computer(this);
        }

        private void validate(Object obj, String name) throws InvalidParameterException {
            if (Objects.isNull(obj) || obj.toString().isEmpty()) {
                throw new InvalidParameterException("invalid parameter " + name);
            }
        }

        public Builder setRam(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder setHdd(String hdd) {
            this.hdd = hdd;
            return this;
        }

        public Builder setUsbPorts(int usbPorts) {
            this.usbPorts = usbPorts;
            return this;
        }

        public Builder setBluetoothSupported(boolean bluetoothSupported) {
            isBluetoothSupported = bluetoothSupported;
            return this;
        }

        public Builder setGraphicsCardSupported(boolean graphicsCardSupported) {
            isGraphicsCardSupported = graphicsCardSupported;
            return this;
        }

        public Builder setWifiSupported(boolean wifiSupported) {
            isWifiSupported = wifiSupported;
            return this;
        }
    }
}
