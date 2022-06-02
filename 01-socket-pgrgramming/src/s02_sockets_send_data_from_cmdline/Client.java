package s02_sockets_send_data_from_cmdline;

import java.io.*;
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

        // inputStream to read data from server
        InputStream socketInputStream = socket.getInputStream();
        BufferedInputStream buffInputStream = new BufferedInputStream(socketInputStream);
        DataInputStream inputStream = new DataInputStream(buffInputStream);

        String line;
        while (true) {
            line = cmdInput.readLine();
            // type "stop" to stop the communication
            if ("stop".equalsIgnoreCase(line)) {
                outputStream.close();
                break;
            } else {
                // write data to server
                outputStream.writeUTF(line);

                // read data from server and print
                String responseData = inputStream.readUTF();
                if(!"".equals(responseData)) {
                    System.out.println("server responded: "+responseData);
                }
            }
        }
        // close connection
        socket.close();
    }
}
