package libreria;

public class OfertaAutor implements OfertaFlex {
	private double porcDescuento;
	private String[] autoresOferta;
	public OfertaAutor(double porc, String[] aut) {
		porcDescuento=porc;
		autoresOferta=aut;
	}
	@Override
	public double getDescuento(Libro lib) {
		double desc=0;
		int pos=buscarAutorOferta(lib.getAutor());
		if(pos>=0) {
			desc=porcDescuento;
		}
		return desc;
	}
	private int buscarAutorOferta (String aut) {
		int pos=-1;
		for(int i=0; i<autoresOferta.length && pos<0;i++) {
			if(autoresOferta[i].toUpperCase().equals(aut.toUpperCase())) {
				pos=i;
			}
		}
		return pos;
	}
	@Override
	public String toString() {
		String cad="[";
		for(int i=0; i<autoresOferta.length;i++) {
			cad+=autoresOferta[i];
			if(i<autoresOferta.length-1) {
				cad+=", ";
			}
		}
		cad+="]";
		return Double.toString(porcDescuento)+"%"+cad;
	}
}
