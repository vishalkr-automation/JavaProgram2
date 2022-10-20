package programs;

import java.net.InetAddress;
import java.net.UnknownHostException;

// write a program to Print IP Address
public class IP_Address {

	public static void main(String[] args) throws UnknownHostException {
		System.out.println(InetAddress.getLocalHost());

	}

}
