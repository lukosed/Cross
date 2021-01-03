package testDileep;

public class Hello {

	public static void main(String[] args) {
		sample s1=new sample();
		sample s2=new sample();
		s1.a=300;
		s1.b=400;
		s2.a=120;
		s2.b=230;
		
		SumOf s3=new SumOf();
		SumOf s4=new SumOf();
		s3.a=3000;
		s3.b=200;
		//s3.justsum();
s3.calculatesum();		
		
		//s1.display();
		//s2.display();
		//System.out.println(s1.a+" "+s1.b+" "+s2.a+" "+s2.b);


	}

	private static void calculatesum() {
		// TODO Auto-generated method stub
		
	}

}
