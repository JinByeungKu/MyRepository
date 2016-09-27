package ch18.exam17.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			//서버의 어떤 ip라도 접근할 수 있도록 한것
			serverSocket = new ServerSocket(5001);
			
			//서버의 특정IP로 접근할 수 있도록 한 것
			/*serverSocket = new ServerSocket();
			SocketAddress sa = new InetSocketAddress("192.168.0.5", 5001);
			serverSocket.bind(sa);*/  //서버 포트번호와 연결시킴
			while(true){
			System.out.println("[클라이언트의 연결을 기다림]");
			Socket socket = serverSocket.accept();  //클라이언트의 소켓을 서버에서 accept함
			
			//클라이언트의 IP정보 얻기
			String clientIP = socket.getInetAddress().getHostAddress();
			System.out.println("[클라이언트(" + clientIP + ")의 연결을 수락함]");
			
			//클라리언트의 연결을 끊음
			socket.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
