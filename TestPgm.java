package testDileep;

public class TestPgm {

	 int a=12;
	 static int b=13;
	//------------------------
	public static void main(String[] args) {
		TestPgm num1=new TestPgm ();
		TestPgm num2=new TestPgm();
		num1.a=10;
		num2.a=100;
		num1.b=777;
		num2.b=888;
		
System.out.println("num1 "+num1.a+" num2 "+num2.a);
System.out.println("num1 "+num1.b+" num2 "+num2.b);
num1.Hello();

	}

	
	 void Hello() {
		System.out.println("Hi Hello");
	}
}
