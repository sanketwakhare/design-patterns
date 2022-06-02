package s01_first_connection;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {

        try {
            ServerSocket server = new ServerSocket(8181);
            System.out.println("Server started");

            DataInputStream inputStream;
            Socket socket = server.accept();
            try {
                while(!socket.isInputShutdown()) {
                    InputStream socketInputStream = socket.getInputStream();
                    BufferedInputStream buffInputStream = new BufferedInputStream(socketInputStream);
                    inputStream = new DataInputStream(buffInputStream);
                    String data = inputStream.readUTF();
                    System.out.println(data);
                }
            } catch (EOFException e) {
                System.out.println("no more data");
            }
            // close server socket
            socket.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
