package JAVA.Net;

import sun.net.www.http.KeepAliveCache;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Proxy;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket();
        socket.getKeepAlive();


        OutputStream os = socket.getOutputStream();
        os.write("hello 服务器".getBytes());
        InputStream is = socket.getInputStream();//输入input
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);//读取input
        socket.close();

    }
}
