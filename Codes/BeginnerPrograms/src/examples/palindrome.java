package examples;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="madam ante madam anthe";
		System.out.println(isPalindromeDetailedWay(str));
	}
		
	
	
	public static String isPalindromeDetailedWay(String s) {
		StringBuilder sb=new StringBuilder();
		String sp[]=s.split(" ");
		for(int i=0;i<sp.length;i++) {
	      sb.append(new StringBuilder(sp[i].reverse()).toString.equals(s)).append(" ");
		}
		return sb.toString().trim();
	}
}


		
	
	
			
	


