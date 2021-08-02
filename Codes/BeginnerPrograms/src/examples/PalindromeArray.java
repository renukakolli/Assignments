
package examples;

import java.util.Scanner;

public class PalindromeArray {
	public static int palindrome(int n) {
		int rev=0;
		while(n!=0) {
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		return rev;
	}
	
	public static boolean ispali(int n) {
		return n==palindrome(n);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int size=sc.nextInt();
		int ar[]=new int[size];
		for(int i=0;i<size;i++) {
			ar[i]=sc.nextInt();
		}
		
		System.out.println("palindrome elements");
		for(int i=0;i<ar.length;i++) {
			if(ispali(ar[i])) {
				System.out.print(ar[i]+" ");
			}
			
		}

	}
	
	 

}