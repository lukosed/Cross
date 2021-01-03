package testDileep;

public class ThreadMainFn {

	public static void main(String[] args) {
		SampleThread obj1=new SampleThread(1);
		obj1.start();
		SampleThread obj2=new SampleThread(20);
		obj2.start();
		SampleThread obj3=new SampleThread(300);
		obj3.start();
	}

}
