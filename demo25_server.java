package practice1_2;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class demo25_server {
	public static void main(String[] args) {
		ConnectionThread con=new ConnectionThread();
		con.start();
	}
}
	
	class ConnectionThread extends Thread{
		public void run(){
			ServerSocket ss=null;
			try {
				ss=new ServerSocket(7877);
				while(true){
					Socket so=ss.accept();	
					System.out.println("接收到一个客户端连接："+so.getInetAddress());
					new ClientThread(so).start();
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				try {
					if(ss!=null)
					ss.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	class ClientThread extends Thread{
		private Socket so=null;
		public ClientThread(Socket so) {
			this.so=so;
		}
		public void run(){
			try {
				InputStream input=so.getInputStream();
				byte[] buf=new byte[1024];
				int length=-1;
				
				while((length=input.read(buf))!=-1){
					System.out.println(new String(buf,0,length));
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				
					try {
						so.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
		}
	}
