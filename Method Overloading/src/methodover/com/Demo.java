package methodover.com;

public class Demo {
	void display(int a){
		System.out.println("Value of a "+a);
	}
	
	void display(double b,int a){
		System.out.println("value of b "+b);
		System.out.println("value of a "+a);
	}
	
	void display(String a,int b){
		System.out.println("value of a "+a);
		System.out.println("value of b "+b);
	}
	
	void display(double a, double b){
		System.out.println("value of a "+a);
		System.out.println("valur of b "+b);
		
	}
	public static void main(String[] args) {
		Demo d= new Demo();
		d.display(200);
		d.display(45.65, 34.56);
		d.display(67.89, 43);
		d.display("FGH", 45);

	}

}
