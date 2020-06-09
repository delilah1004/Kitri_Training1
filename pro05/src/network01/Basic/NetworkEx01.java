package network01.Basic;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 22.
 * @Description : 
 * 
 * 
 * 네트워크 통신시 사용되는 용어들
 * 
 * 1) IP 주소 : 네트워크상에 유일하게 식별될 수 있는 네트워크 장치의 주소
 * 				  4개 숫자가 점으로 연결되어 있으며, 각각은 0~255로 표현 가능  ex)192.156.11.15
 * 				  현재 4개의 숫자로 표현된 IP 주소는 32bit IPv4로 사용된다. 고갈되면 128bit IPv6가 사용될 추세이다. 
 * 				  네트워크 환경에 따라서 고정 IP, 유동 IP가 존재한다.
 * 2) PORT : 네트워크를 통해서 데이터를 주고 받는 출입구 0~65535
 * 3) 내 컴퓨터 IP 주소 확인 : C:> IPCONFIG 192.168.0.3
 * 4) 도메인 네임 : www.naver.com
 * 5) DNS 서버 : DNS 서버를 통해 도메인 네임을 IP 주소로 변환
 * 
 * 
 * 네트워크 통신 종류
 * 1) TCP/IP (Transfer Control Protocol / Internet Protocol) : 전화기 통신
 * - IP : 네트워크 연결되는 개개의 컴퓨터 주소
 * - TCP : IP 프로토콜 위에서 연결형 서비스를 지원하는 전송 계층 프로토콜
 * 2) UTP (User Datagram Protocol) : 소포 방식, 편지
 * 		비연결 지향적 프로토콜이다. 비연결 지형적이란 데이터를 주고 받을 때 연결 절차를 거치지 않고,
 * 		일방적으로 데이터를 발신하는 방식
 */

public class NetworkEx01 {
	public static void main(String[] args) {
		
		try {
			
			InetAddress a = InetAddress.getByName("www.kitri.re.kr");
			
			System.out.println("IP 주소 : " + a.getHostAddress());
			System.out.println("도메인 네임 : " + a.getHostName());
			
			System.out.println();
			
			InetAddress b = InetAddress.getLocalHost();
			System.out.println("IP 주소 : " + b.getHostAddress());
			System.out.println("도메인 네임 : " + b.getHostName());
			
			System.out.println();
			
			InetAddress[] c = InetAddress.getAllByName("www.naver.com");
			// System.out.println(c.length);
			
			for(int i=0; i<c.length;i++) {
				System.out.println("IP 주소 : " + c[i].getHostAddress());
				System.out.println("도메인 네임 : " + c[i].getHostName());
				System.out.println();
			}
			
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
			
		}

		
	}
}