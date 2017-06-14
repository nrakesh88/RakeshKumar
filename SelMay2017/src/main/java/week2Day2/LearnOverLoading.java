package week2Day2;

public class LearnOverLoading {

	public void login(String uName, String pwd){

	}
	
	//public void details();


	public String login(int phone, String pwd){
		return pwd;

	}

	public static void main(String[] args) {

		LearnOverLoading ol = new LearnOverLoading();
		ol.login(123456, "Karim");

	}

}








