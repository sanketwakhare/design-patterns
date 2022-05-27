package s01_first_connection;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        Socket socket = new Socket();
        try {
            socket.connect(new InetSocketAddress("0.0.0.0", 8181));

            String data = "Hello World. This is first message from Client";
            OutputStream socketOutStream = socket.getOutputStream();
            DataOutputStream outputStream = new DataOutputStream(socketOutStream);
            outputStream.writeUTF(data);

            // close connection
            socket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
