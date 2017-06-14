package week1Day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {

	public HelloWorld(){

	}
	
	static HelloWorld  tx = new HelloWorld();

	public static void main(String[] args) {
		HelloWorld txt = new HelloWorld();
		txt.b();
		ChromeDriver driver = new ChromeDriver();
		System.out.println("Karim is owner of TestLeaf");
		//		b();
	}

	public void a(){
		b();
		LearnIns x = new LearnIns();
		x.getName();
		main(null);
	}

	public static void b(){
		
	//	HelloWorld  tx = new HelloWorld();
		tx.a();
	}



}









