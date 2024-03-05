package INetAddressDemo;

import java.net.*;

class InetDemo {
	public static void main(String[] args) throws Exception {
		InetAddress ip;
		ip = InetAddress.getByName("www.javatpoint.com");
		System.out.println("Host Name: " + ip.getHostName());
		System.out.println("IP Address: " + ip.getHostAddress());
	}
}