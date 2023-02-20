package libreria;
import java.util.*;

public class Libreria {
	private ArrayList<Libro> libs;
	
	public Libreria () {
		libs= new ArrayList<>();
	}
	public void addLibro (String na, String tit, double pb) {
		Libro x= new Libro (na, tit, pb);
		anyadirLibro(x);
	}
	protected void anyadirLibro (Libro x) {
		libs.add(x);
	}
	public void remLibro (String aut, String tit) {
		int pos= buscarLibro(aut, tit);
		if(pos<0) {
			throw RuntimeException ("Libro no encontrado ("+aut+", "+tit+")")
		}else {
			libs.remove(pos);
		}
	}
	private int buscarLibro (String aut, String tit) {
		int pos=-1;
		for(int i=0; i<(libs.size()) && pos<0 ;i++) {
			pos=i;
		}
		return pos;
	}
}
