package examples;

public class UpperLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="renuka want to learn java full stack";
		System.out.println(upperletter(str));
	}
	public static String upperletter(String s) {
		String sp[]=s.split(" ");
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<sp.length;i++) {
			sb.append(sp[i].substring(0,sp[i].length()-1)).append(Character.toUpperCase(sp[i].charAt(sp[i].length()-1))).append(" ");
		}
		return sb.toString().trim();
	}
}
