package Server;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class MobilePTServer {
	private ServerSocket serverSocket = null;
	private Socket clientSocket = null;
	private Thread thread[] = new Thread[100];
	String addr;
	int count = 0;
	public MobilePTServer() {
		try {
			addr = InetAddress.getLocalHost().getHostAddress();
			serverSocket = new ServerSocket(8030);
			System.out.println("서버의 ip주소: " + addr);
			while(true) {
				System.out.println("대기중 .........");
				clientSocket = serverSocket.accept();
				thread[count] =  new Thread(new MobilePT(clientSocket));
				thread[count].start();
				count++;
				System.out.println("연결 완료: "+ count);
			}
		}catch(Exception e) {
			System.out.println("(ERROR)[Server.Server]: " + e.getMessage());
		}finally {
			try {
				System.out.println("닫음");
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
