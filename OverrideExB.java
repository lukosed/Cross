package testDileep;



class OverrideExB extends OverrideExamA {
 void display() {
	System.out.println("This is B");
	super.display();

}
public static void main(String[] args) {
	OverrideExB obj1=new OverrideExB();
	obj1.display();
	obj1.superEx();
	
	
	
	
}
void superEx() {
	super.display();
	
}
}
