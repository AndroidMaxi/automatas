package ArbolSintactico;

public class nodx2 {
	private String type1;
	private String type2;
	public nodx2(String type1, String type2) {
		super();
		this.type1 = type1;
		this.type2 = type2;
	}
	public String getType1() {
		return type1;
	}
	public void setType1(String type1) {
		this.type1 = type1;
	}
	public String getType2() {
		return type2;
	}
	public void setType2(String type2) {
		this.type2 = type2;
	}
	@Override
	public String toString() {
		return "nodx2 [Hijo1=" + type1 + ", Hijo2=" + type2 + "]";
	}
	
	
}


