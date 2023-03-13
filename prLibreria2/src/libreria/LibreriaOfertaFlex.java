package libreria;

public class LibreriaOfertaFlex extends Libreria {
	private OfertaFlex oferta;
	
	public LibreriaOfertaFlex(OfertaFlex inpu) {
		super();
		oferta=inpu;
	}
	public void setOferta(OfertaFlex inpu) {
		oferta=inpu;
	}
	public OfertaFlex getOferta() {
		return oferta;
	}
	@Override
	public void addLibro (String aut, String tit, double pb) {
		Libro lib=new Libro(aut,tit,pb);
		if(oferta.getDescuento(lib)!=0) {
			lib=new LibroOferta(aut,tit,pb,oferta.getDescuento(lib));
		}
		anyadirLibro(lib);
	}
	@Override
	public String toString() {
		return oferta.toString()+super.toString();
	}
}