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
	public void remLibro (String aut, String tit) {
		int pos= buscarLibro(aut, tit);
		if(pos<0) {
			throw new RuntimeException ("Libro no encontrado ("+aut+", "+tit+")");
		}else {
			libs.remove(pos);
		}
	}
	private int buscarLibro (String aut, String tit) {
		int pos=-1;
		for(int i=0; i<(libs.size()) && pos<0 ;i++) {
			Libro l=libs.get(i);
			if(l.getAutor().toUpperCase().equals(aut.toUpperCase()) && l.getTitulo().toLowerCase().equals(tit.toLowerCase())) {
				pos=i;
			}
			
		}
		return pos;
	}
	public double getPrecioFinal (String aut, String tit) {
		int pos= buscarLibro(aut, tit);
		double preci=0;
		if(pos<0) {
			throw new RuntimeException ("Libro no encontrado ("+aut+", "+tit+")");
		}else {
			Libro l = libs.get(pos);
			preci=l.getPrecioFinal();
		}
		return preci;
	}
	
	@Override
	public String toString () {
		String cad="[";
		for (int i =0; i<libs.size(); i++) {
			Libro l= libs.get(i);
			cad+=l.toString();
			if(!(i==libs.size()-1)) {
				cad+=", ";
			}	
		}
		cad+="]";
		return cad;
	}
	protected void anyadirLibro (Libro libro) {
		String aut= libro.getAutor();
		String tit= libro.getTitulo();
		int pos= buscarLibro(aut, tit);
		if(pos<0) {
			libs.add(libro);
		}else {
			libs.remove(pos);
			libs.add(pos,libro);
		}
	}
}
