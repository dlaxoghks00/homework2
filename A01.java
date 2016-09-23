import java.util.*;

class A01 {

	int age = 0;

	public static void main(String[] s){
	
		new A01().start();
	
	}

	void start() {
		Scanner s = new Scanner(System.in);
		System.out.print("what is your birth year? : ");
		int year = s.nextInt();
		this.age = 2016 - year + 1;
		cal();
	}

	void cal() {

		if(this.age < 20)
			System.out.println("You are child.");
		else
			System.out.println("You are Adult.");

	}
}
