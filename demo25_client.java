package practice1_2;

import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class demo25_client {
	public static void main(String[] args) throws Exception {
		Socket so=new Socket("127.0.0.1",7877);
		OutputStream output=so.getOutputStream();
		
		while(true){
			Scanner scan=new Scanner(System.in);
			String str=scan.nextLine();
			if(str.equals("exit")){
				break;
			}
				output.write(str.getBytes());
		
		
		}
		so.close();
	}
	
}
