package libreria;

public class LibroOferta extends Libro {
	private double porcDescuento;
	private String[] autoresOferta;
	
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
		return "("+getAutor()+"; "+getTitulo()+"; "+Double.toString(super.getPrecioBase())+"; "+Double.toString(porcDescuento)+"%; "+Double.toString(getBaseImponible())+"; "+Double.toString(super.getIVA())+"%; "+Double.toString(getPrecioFinal())+")";
	}
}
	