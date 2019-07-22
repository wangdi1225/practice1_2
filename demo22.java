package practice1_2;

public class demo22 {
	private demo22(){
	}
	private static demo22 instance=new demo22();
	public static demo22 getInstance(){
		return instance;
	}
}
