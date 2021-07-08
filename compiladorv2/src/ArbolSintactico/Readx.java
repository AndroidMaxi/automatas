package ArbolSintactico;

public class Readx extends Statx{
    Expx s1;
    public Readx(Expx st1) {
        s1 = st1;
    }
	@Override
	public String toString() {
		return "Readx [s1=" + s1 + "]";
	}
}