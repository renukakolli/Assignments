package solves;

import java.util.Scanner;

public class Secure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		if(s.startsWith("https")) {
			System.out.println("Secure");
		}else {
			System.out.println("Not Secure");
		}

	}

}
