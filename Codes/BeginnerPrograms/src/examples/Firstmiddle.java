package examples;

public class Firstmiddle {
	public static void main(String[] args) {
		String str="nature isa god given gift";
		System.out.println(middle(str));
	}
	public static String middle(String s) {
		String sp[]=s.split(" ");
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<sp.length;i++) {
		    if((sp[i].length()%2)!=0) {
		    	sb.append(sp[i].substring(0,(sp[i].length())/2)).append(Character.toUpperCase(sp[i].charAt(sp[i].length()/2)))
				.append(sp[i].substring(sp[i].length()/2+1,sp[i].length())).append(" ");
			}
		    else {
		    	sb.append(Character.toUpperCase(sp[i].charAt(0))).append(sp[i].substring(1)).append(" ");
		    }
		}
		return sb.toString().trim();
	}
}
		