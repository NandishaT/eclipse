package methodover.com;

public class MainClass {

	public static void main(int a) {
		System.out.println("java");
	}
	
	public static void main(double a) {
		System.out.println("bye");
	}
	
	public static void main(String[] args) {
		System.out.println("hello");
		main(10);
		main(98.5);
	}
}

