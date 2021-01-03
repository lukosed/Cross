package testDileep;

 class SuperInConstructorB extends SuperInConstructorA {
	 SuperInConstructorB() {
		System.out.println("this is construcor B");
	}
SuperInConstructorB(int a){
	super(10);
	System.out.println("B-Argument Constr"+a);
}
	public static void main(String[] args) {
	SuperInConstructorB obj1=new SuperInConstructorB(90);
	}

}
