import java.util.*;

class A01 {

	int age = 0;

	public static void main(String[] s){
	
		new A01.start();
	
	}

	void start() {
		Scanner s = new Scanner(System.in);
		System.out.print("태어난 년도를 입력하세요 : ");
		int year = s.nextInt();
		this.age = 2016 - year + 1;
		cal();
	}

	void cal() {

		if(this.age < 20)
			System.out.println("미성년자입니다.");
		else
			System.out.println("미성년자가 아닙니다.");

	}
}
