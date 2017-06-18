
package week1Day2;

public class Sample {
	public static void main(String[] args) {
		String x = "13458";
		char[] txt = x.toCharArray();	
	//	int smallest = txt[0];
		int largetst = txt[0];

		for(int i=0; i< txt.length; i++) {
			if(txt[i] > largetst)
				largetst = txt[i];
			/*else if (txt[i] < smallest)
				smallest = txt[i];*/

		}
		System.out.println(largetst);
	}

	
}
