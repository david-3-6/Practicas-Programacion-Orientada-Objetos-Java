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
		
	}
}
