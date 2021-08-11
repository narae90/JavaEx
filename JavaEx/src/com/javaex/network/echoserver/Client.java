package com.javaex.network.echoserver;

import java.io.IOException;
import java.net.*;

public class Client {

	public static void main(String[] args) {
		Socket socket = null;
		
		try {
			// 소켓 생성 : 데이터 통신용
			socket = new Socket();
			// 시작 메세지
			System.out.println("<클라이언트 시작>");
			System.out.println("[연결 요청]");
			
			// 접속 시도
			InetSocketAddress server= new InetSocketAddress("172.30.1.40", 10000);
			socket.connect(server);
			System.out.println("[서버에 연결되었습니다.]");
			
			// 종료
			System.out.println("<클라이언트 종료>");
		} catch (ConnectException e) {
			System.out.println("[접속이 거부되었습니다.]");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
