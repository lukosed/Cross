package testDileep;

 class SampleThread extends Thread
 {
int a,i;

SampleThread(int a) 
{
this.a=a;
}
 @Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for (i=0;i<5;i++) {
			System.out.println("for "+a+": Thread Count ="+i);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
