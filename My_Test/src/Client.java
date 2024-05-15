import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) {
		int port = 1000;
		String ip주소;
		
		try {
			ip주소 = InetAddress.getLocalHost().getHostAddress();
			
			Socket socket = new Socket(ip주소, port);
			System.out.println("서버에 접속완료");
			
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			
			out.write("Hi");
			
			String m = in.readLine();
			System.out.println("From server : " + m);
			
			out.close();
			in.close();
			socket.close();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
