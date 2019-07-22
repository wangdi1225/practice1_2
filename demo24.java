package practice1_2;

public class demo24 {
	public static void main(String[] args) {
		String string="ÎÒÊÇwangdi";
		int n=3;
		splitString(string,n);
	}
	public static void splitString(String str,int i){
//		int length=0;
		byte a[]=str.getBytes();
		int length=a.length;
		if(i>length){
			i=length;
		}
		if(a[i]<0){
			String str1=new String(a,0,(i-1));
			System.out.println(str1);
		}
		else{
			String str1=new String(a,0,i);
			System.out.println(str1);
		}
		
	}
}
