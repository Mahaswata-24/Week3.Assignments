package week3.day1;

public class Pseudocode {

	public static void main(String[] args) {
		String str = "Mahaswata";
		char[] charArray = str.toCharArray();
		
		for (int i = charArray.length-1; i >= 0; i--) {
			// to print in next line
			//System.out.println(charArray[i]);
			
			// to print in same line
			System.out.print(charArray[i]);
			
		}
	}
	
	
}
