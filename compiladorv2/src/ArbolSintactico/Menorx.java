package ArbolSintactico;

public class Menorx extends Expx{
    private Idx s1;
    private Idx s2;
     
    public Menorx(Idx st1, Idx st2){ 
        s1 = st1;
        s2 = st2;
    }

	@Override
	public String toString() {
		return "Menorx [s1=" + s1 + ", s2=" + s2 + "]";
	}
}
