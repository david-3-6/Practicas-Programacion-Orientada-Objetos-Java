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
		if(lib.getPrecioBase()>=umbralPrecio) {
			desc=porcDescuento;
		}
		return desc;
	}
	@Override
	public String toString() {
		return Double.toString(porcDescuento)+"%("+Double.toString(umbralPrecio)+")";
	}
}
