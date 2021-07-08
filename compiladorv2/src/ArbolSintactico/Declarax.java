package ArbolSintactico;

public class Declarax {
    public String s1;
    public Typex s2;    
     
    public Declarax( Typex st2, String st1) {
        s1 = st1;
        s2 = st2;
    }

	@Override
	public String toString() {
		return "Declarax [s1=" + s1 + ", s2=" + s2 + "]";
	}
}
