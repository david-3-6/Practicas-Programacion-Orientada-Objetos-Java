package libreria;

public class LibreriaOferta extends Libreria{
	private double porcDescuento;
	private String[] autoresOferta;
	
	public LibreriaOferta (double desc, String[] aut) {
		porcDescuento=desc;
		autoresOferta= aut;
	}
	public void setOferta(double desc, String[] aut) {
		porcDescuento=desc;
		autoresOferta=aut;
	}
	public String[] getOferta () {
		return autoresOferta;
	}
	public double getDescuento() {
		return porcDescuento;
	}
	
	@Override
	public void addLibro(String aut, String tit, double pb) {
		int pos=buscarAutorOferta(aut);
		Libro libr;
		if(pos<0) {
			libr= new Libro(aut,tit,pb);
		}else {
			libr=new LibroOferta(aut,tit,pb,porcDescuento);
		}
		anyadirLibro(libr);
	}
	private int buscarAutorOferta(String aut) {
		int pos=-1;
		for(int i=0; i<autoresOferta.length && pos<0; i++) {
			if(autoresOferta[i].toUpperCase().equals(aut.toUpperCase())) {
				pos=i;
			}
		}
		return pos;
	}
	
	@Override
	public String toString() {
		String cadaut="[";
		for (int i =0; i<autoresOferta.length;i++) {
			cadaut+=autoresOferta[i];
			if(i<autoresOferta.length-1) {
				cadaut+=", ";
			}
		}
		cadaut+="]";
		return Double.toString(porcDescuento)+"%"+cadaut+super.toString();
	}
	
}
