package s03_multithreading;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 5; i++) {
            connect(i);
        }
    }

    public static void connect(int index) throws IOException {

        Socket socket = new Socket();
        socket.connect(new InetSocketAddress("192.168.1.4", 8080));

        OutputStream socketOutStream = socket.getOutputStream();
        DataOutputStream outputStream = new DataOutputStream(socketOutStream);

        outputStream.writeUTF("data from client " + index);

        outputStream.close();
    }
}
