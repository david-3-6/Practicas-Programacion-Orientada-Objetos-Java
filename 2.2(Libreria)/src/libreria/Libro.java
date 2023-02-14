package libreria;

public class Libro {
	private static double porcIVA=10.0;
	private String autor, titulo;
	private double precioBase;
	
	public Libro (String aut, String tit, double pb) {
		precioBase=pb;
		autor=aut;
		titulo=tit;
	}
	public String getAutor () {
		return autor;
	}
	public String getTitulo () {
		return titulo;
	}
	public double getPrecioBase () {
		return precioBase;
	}
	protected double getBaseImponible () {
		return precioBase;
	}
	public double getPrecioFinal () {
		return (getBaseImponible()+getBaseImponible()*(porcIVA/100));
	}
	
	@Override
	public String toString() {	
		return "("+autor+"; "+titulo+"; "+Double.toString(precioBase)+"; "+Double.toString(porcIVA)+"%; "+Double.toString(getPrecioFinal());
	}
	
	public static double getIVA() {
		return porcIVA;
	}
	
	public static void setIVA (double nuevo) {
		porcIVA=nuevo;
	}
	
	
}
