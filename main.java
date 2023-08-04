package palin;

public class pal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="bob";
		String res="";
		for(int i=0;i<a.length();i++) {
			res=a.charAt(i)+res;
		}
		System.out.println(res);
		if(res.equals(a)) {
		System.out.println("palindrome");
		}
		else {
			System.out.println("not");
			
		}}
	

}
