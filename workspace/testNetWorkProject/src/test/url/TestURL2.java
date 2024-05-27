package test.url;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TestURL2 {

	public static void main(String[] args) {
		// 키보드로 URL 을 입력받아, 프로토콜, 포트번호, 호스트명, 파일경로, 쿼리스트링 출력 처리함
		// 단, URL 은 한 줄씩 입력받고, URL 앞뒤에 안보이는 공백 제거함
		// url 의 호스트명으로 ip 주소 조회 출력 => 반복 실행 : none 입력시 종료 처리함
		// 키보드 입력은 BufferedReader 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.print("URL을 입력해주세요 : ");
			try {
				String urls = br.readLine().trim();
				if (urls.equals("none")) {
					break;
				}
				URL url = new URL(urls);
				System.out.println("프로토콜 : "+ url.getProtocol());
				System.out.println("포트번호 : " + url.getPort());
				System.out.println("host : " + url.getHost());
				System.out.println("URL 내용 : " + url.getContent());
				System.out.println("파일경로 : " + url.getFile());
				System.out.println("URL전체 : " + url.toExternalForm());
				System.out.println("쿼리스트링 : " + url.getQuery());

				InetAddress[] inets = InetAddress.getAllByName(url.getHost());
				for (InetAddress inet : inets) {
					System.out.println(inet.getHostAddress());
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} while (true);

	}

}