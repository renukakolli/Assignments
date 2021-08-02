package examples;

import java.util.Scanner;

public class ArraysMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		int max=ar[0];
		for(int i=0;i<n;i++) {
			if(max<ar[i]) {
				max=ar[i];
			}
		}
		System.out.println(max);
	}

}
