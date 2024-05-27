package test.tcp.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

//TCP 통신용 서버측 프로그램
public class TCPServer {

	public static void main(String[] args) throws IOException {
		// 1. port 번호 지정
		// 가능하면 2000번 이후 값으로, 이전 값은 이미 정해진것들이 있음
		int port = 5000;
		//은행의 창구번호 같은 느낌
		
		//2. 서버용 소켓 객체 생성
		ServerSocket server = new ServerSocket(port); //IOException 포트번호가 잘못됐을때 발생
		
		//3. 클라이언트가 연결을 요청할 때까지 기다림
		while(true) {
			//4. 연결 요청이 오면 요청을 수락함 => 클라이언트 정보를 저장함 : 소켓객체
			Socket client = server.accept();	//연결된 상태임 (client != null)
			
			//5. 해당 클라이언트와 입출력 스트림 생성함
			InputStream input = client.getInputStream(); //클라이언트와 연결하는 스트림
			OutputStream output = client.getOutputStream();
			
			//사용 또는 성능의 편의를 위해 보조스트림을 추가 연결해도 됨
			BufferedReader br = new BufferedReader(new InputStreamReader(input));
			//바이트로 온거를 내부에서 스트링으로 바꿈
			PrintWriter pw = new PrintWriter(output);
			
			//6. 문자 데이터 주고 받기
			String message = br.readLine();	//클라이언트가 보낸 메세지를 먼저 받음
			//client.getInetAddress().getHostAddress()  클라이언트의 ip주소를 표시
			System.out.println(client.getInetAddress().getHostAddress() + " 가 보낸 메세지 : " + message);
			pw.print("잘 받았음");//서버측에서 클라이언트에게 답을 보냄
			pw.flush();
			
			//7. 서로 통신이 완료되면 스트림 반납함
			pw.close();
			br.close();
			input.close();
			output.close();
		}

	}

}
