package string;

public class JavaPGMs {

	public static void main(String[] args) {

		/*Reverse the given string*/


		/*Find the next letter from the given string*/
		String varStr = "Testleaf";
		String finalChar="";
		for (int i = 0; i < varStr.length(); i++) {
			char singChar = varStr.charAt(i);
			System.out.println(singChar);
			int ascii = singChar+1;
			System.out.println(ascii);
			char nextChar = (char) ascii;
			finalChar = finalChar+nextChar;
		}
		System.out.println(finalChar);
	}

}
