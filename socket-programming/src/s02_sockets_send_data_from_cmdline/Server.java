package s02_sockets_send_data_from_cmdline;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {
        // Create Server Socket which listens on port 9000
        ServerSocket server = new ServerSocket(9000);
        System.out.println("Server started");

        // wait for Client to connect
        Socket socket = server.accept();

        // this gets executed after Client is connected to server

        // Create inputStream to read data received from Client
        InputStream socketInputStream = socket.getInputStream();
        BufferedInputStream buffInputStream = new BufferedInputStream(socketInputStream);
        DataInputStream inputStream = new DataInputStream(buffInputStream);

        while (!socket.isInputShutdown()) {
            String data;
            try {
                // read data and print
                data = inputStream.readUTF();
                System.out.println(data);
            } catch (EOFException e) {
                // when end of file is reached
                break;
            }
        }
        // close server socket
        server.close();
    }
}
