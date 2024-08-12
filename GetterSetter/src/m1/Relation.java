package m1;


public class Relation {
	private int a;
	private int b;
	
	public void setterA(int a) {
		this.a=a;
		
	}
	public void setterB(int b) {
		this.b=b;
	}
	
	public int getterA() {
		return a;
	}
	public int getterB() {
		return b;
	}
	
	
}
class B{
	public static void main() {
		Relation r=new Relation();
		r.setterA(5);
		r.setterB(10);
		System.out.println(r.getterA());
		System.out.println(r.getterB());
	}
}
