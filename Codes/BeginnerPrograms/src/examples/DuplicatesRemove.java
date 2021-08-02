package examples;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicatesRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		Arrays.sort(ar);
		System.out.println(Arrays.toString(ar));
		int c[]=new int[n];
		int j=0;
		for(int i=0;i<ar.length-1;i++) {
			if(ar[i]!=ar[i+1]) {
				c[j]=ar[i];
				j++;
			}
		}
		c[j++]=ar[n-1];
		for(int i=0;i<n-1;i++) {
		      System.out.print(c[i]+" ");
		}
	}
}
		