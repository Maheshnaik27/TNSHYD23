package m4;

public class Eductaion {
	private String name;
	private String ssc;
	private String inter;
	private String eamcet;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSsc() {
		return ssc;
	}
	public void setSsc(String ssc) {
		this.ssc = ssc;
	}
	public String getInter() {
		return inter;
	}
	public void setInter(String inter) {
		this.inter = inter;
	}
	public String getEamcet() {
		return eamcet;
	}
	public void setEamcet(String eamcet) {
		this.eamcet = eamcet;
	}
	
	public void result(String ssc, String inter, String eamcet) {
		if(this.ssc.equals("PASS")&& this.inter.equals("PASS")&&this.eamcet.equals("QUALIFIED")) {
		System.out.println("you are eligible for higher education");
			
			
			
		}else {
			System.out.println("you are not eligible for doing scholarship eduction you can join under managment quota");
			
		}
	}
	

}
