package libreria;

public class OfertaPrecio implements OfertaFlex{
	private double porcDescuento;
	private double umbralPrecio;
	public OfertaPrecio (double porc, double umbral) {
		porcDescuento=porc;
		umbralPrecio=umbral;
	}
	@Override
	public double getDescuento(Libro lib) {
		double desc=0;
		if((lib instanceof LibroOferta) && (lib.getPrecioBase()>=umbralPrecio)) {
			desc=((LibroOferta)lib).getDescuento();
		}
		return desc;
	}
	@Override
	public String toString() {
		return Double.toString(porcDescuento)+"%("+Double.toString(umbralPrecio)+")";
	}
}
