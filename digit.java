package assignment;

import java.util.Scanner;

public class digit {
	public static void main(String[]aargs) {
		Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			int b=0;
			while(a>0) {
				a=a/10;
				b++;
			}
			System.out.println(b);
	}
}
