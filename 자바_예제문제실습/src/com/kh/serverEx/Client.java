package com.kh.serverEx;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
/*
 서버로 서버안녕하세요. 메세지 서버에게 보낸 후 클라이언트 자동으로 종료되게 코드 작성
 */

public class Client {

	public static void main(String[] args) {
		int port = 3000;
		String 서버Ip;
		
		try {
			서버Ip = InetAddress.getLocalHost().getHostAddress();
			
			Socket socket = new Socket(서버Ip, port);
			System.out.println("서버에 연결됐습니다.");
			
			// Buffer 입력한 글자 가져오고 PrintWriter 출력하기
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			
			// 주최자에게 메세지 전송
			out.println("hi server");
			
			// 주최자에게 온 메세지 수신 후 출력
			String m = in.readLine();
			System.out.println("send success : " + m);
			
			//close 작성
			out.close();
			in.close();
			socket.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
