package libreria;

public interface OfertaFlex {
	default double getDescuento(Libro lib) {
		double desc=0;
		if(lib instanceof LibroOferta) {
			desc=((LibroOferta)lib).getDescuento();
		}
		return desc;
	}
}
