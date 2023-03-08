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
	/*private String conversorNombre(String aut) {
		String nombre="";
		int posi=0;
		for (int i=0; i<aut.length();i++) {
			char c= aut.charAt(i);
			if(c==' ' || i==aut.length()-1) {
				String ini=Character.toString(aut.charAt(posi));
				nombre+=ini.toUpperCase()+aut.substring(posi+1, i).toLowerCase();
				if(!(i==aut.length()-1)) {
					nombre+=" ";
				}else {
					nombre+=Character.toString(aut.charAt(aut.length()-1));
				}
				posi=i+1;
			}
		}
		return nombre;
	}*/
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
		return "("+autor+"; "+titulo+"; "+Double.toString(precioBase)+"; "+Double.toString(porcIVA)+"%; "+Double.toString(getPrecioFinal())+")";
	}
	
	public static double getIVA() {
		return porcIVA;
	}
	
	public static void setIVA (double nuevo) { //Con static puedes poner Libro.setIVA() y se cambia, si no pones static en el metodo, hay que declarar una variable.
		porcIVA=nuevo; 
	}
	
	
}
