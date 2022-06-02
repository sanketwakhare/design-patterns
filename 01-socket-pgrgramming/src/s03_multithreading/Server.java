package s03_multithreading;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket();
        serverSocket.bind(new InetSocketAddress(8080));

        while(true) {
            Socket clientSocket = serverSocket.accept();

            InputStream socketInStream = clientSocket.getInputStream();
            DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(socketInStream));

            String data = dataInputStream.readUTF();
            System.out.println(clientSocket.getRemoteSocketAddress() + "->" + data);
        }
    }
}
