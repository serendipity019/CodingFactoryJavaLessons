package gr.aueb.cf.ch26;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class DateTimeServer extends Thread {

    @Override
    public void run() {
        ServerSocket servFd; //File Descriptor
        int serverPort = 13;

        try {
            servFd = new ServerSocket();
            servFd.bind(new InetSocketAddress("127.0.0.1", serverPort), 100); // The number 100 mean the que of the package where waiting. The default is 50.

            while (true) {
                Socket connectedFd = servFd.accept();
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(connectedFd.getOutputStream()));
                bw.write(new Date().toString());
                bw.flush(); // This is make it to not wait to fill first the buffer for write.
                connectedFd.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
