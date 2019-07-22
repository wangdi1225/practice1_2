package practice1_2;

import java.io.File;
import java.util.Scanner;

public class demo23 {
	public static void main(String[] args) {
		System.out.println("请输入需要查询的文件夹路径");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		File p1=new File(str);
		String str1[]=p1.list();
		for (String string : str1) {
			System.out.println(string);
		}
	}
}
