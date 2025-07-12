package Multiple_Tab;

public class Practice {

	public static void main(String[] args) {
		String s= "mom";
		int count =0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==s.charAt(s.length()-1-i)) {
				count++;
				
			}
		}
		
		if(count==s.length()) {
			System.out.println(s+" it is palidrome ");
		}else {
			System.out.println(s+" it is not palidrome ");
		}
			
	}

}
