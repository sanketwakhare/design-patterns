package s02_sockets_send_data_from_cmdline;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        // create Client Socket
        Socket socket = new Socket();
        // connect to given server IP and port
        socket.connect(new InetSocketAddress("0.0.0.0", 9000));

        // as data is sent in form of Stream over network, create outputStream to send data to server
        // Send data to server from command line
        DataInputStream cmdInput = new DataInputStream(System.in);
        OutputStream socketOutStream = socket.getOutputStream();
        DataOutputStream outputStream = new DataOutputStream(socketOutStream);

        String line;
        while (true) {
            line = cmdInput.readLine();
            // type "stop" to stop the communication
            if ("stop".equalsIgnoreCase(line)) {
                outputStream.close();
                break;
            } else {
                outputStream.writeUTF(line);
            }
        }
        // close connection
        socket.close();
    }
}
