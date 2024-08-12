package m2;

public class Election {
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void result(int age, String name) {
		if(this.age>=18) {
			System.out.println("Hey:"+this.name+" your age is: "+this.age+" you are eligible for voting");
			
		}else {
			System.out.println("you are not eligible for voting");
		}
	}

}
