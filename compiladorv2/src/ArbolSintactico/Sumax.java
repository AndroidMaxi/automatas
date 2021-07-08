package ArbolSintactico;

public class Sumax extends Expx{
    private Idx s1;
    private Idx s2;
     
    public Sumax(Idx st1, Idx st2){ 
        s1 = st1;
        s2 = st2;
    }

	@Override
	public String toString() {
		return "Sumax [s1=" + s1 + ", s2=" + s2 + "]";
	}
}