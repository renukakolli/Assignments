package examples;

import java.util.Scanner;

public class PrimeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			int count=0;
			for(int j=2;j<ar[i]-1;j++) {
				if(ar[i]%j==0) {
					count++;
				}
			}
			if(count==0) {
				System.out.print(ar[i]+" ");
			}
		}
		

	}

}
