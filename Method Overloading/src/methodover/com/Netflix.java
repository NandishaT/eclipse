package methodover.com;

public class Netflix {
	static void login(String emailId,int password){
		System.out.println("Logined system using eamilId and password");
	}
	static void login(int contactNo,int otp ){
		System.out.println("Logined in using contactNo and otp");
	}
	public static void main(String[] args) {
		Netflix .login("buabrufj@gmail.com", 978456);
		System.out.println("-------------------------");
		Netflix.login(9875759, 5689);
	}
	}
