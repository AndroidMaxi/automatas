package ArbolSintactico;

import java.util.ArrayList;
import java.util.Vector;

public class Programax {
	
    private Declarax s1;
    //private Vector s1;
    private Statx s2;
     
    public Programax(Declarax st1, Statx st2) {
        s1 = st1;
        s2 = st2;
    }
     
    public Declarax getDeclaration() {return s1;}
     
    public Statx getStatement() {return s2;}

	@Override
	public String toString() {
		return "Programax [s1=" + s1 + ", s2=" + s2 + "]";
	}
}
