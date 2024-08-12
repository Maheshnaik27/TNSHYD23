package m3;
import m2.*;
public class Result {
public static void main(String[] args) {
	Election e=new Election();
	e.setAge(18);
	e.setName("mahesh");
	System.out.println("your name:"+e.getName());
	System.out.println("your age is:"+e.getAge());
	
	
	e.result(18, "mahesh");
	
	
	
	
}
}
