package libreria;

public class LibroOferta extends Libro {
	private double porcDescuento;
	
	public LibroOferta (String aut, String tit, double pb, double desc){
		super(aut, tit, pb);
		porcDescuento=desc;		
	}
	public double getDescuento() {
		return porcDescuento;
	}
	@Override
	protected double getBaseImponible () {
		return super.getBaseImponible()-super.getBaseImponible()*porcDescuento/100;
	}
	
	@Override
	public String toString () {
		return "("+getAutor()+"; "+getTitulo()+"; "+Double.toString(getPrecioBase())+"; "+Double.toString(porcDescuento)+"%; "+Double.toString(getBaseImponible())+"; "+Double.toString(getIVA())+"%; "+Double.toString(getPrecioFinal())+")";
	}
}
