package JAVA.Net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);
        Socket socket = server.accept();
        InputStream is = socket.getInputStream();//输入input
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);//读取input
        System.out.println(new String(bytes,0,len));
        OutputStream os = socket.getOutputStream();
        os.write("收到，谢谢".getBytes());
        socket.close();
        server.close();
    }

}
