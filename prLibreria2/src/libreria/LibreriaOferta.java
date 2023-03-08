package libreria;

public class LibreriaOferta extends Libreria{
	private double porcDescuento;
	private String[] autoresOferta;
	
	public LibreriaOferta (double desc, String[] aut) {
		porcDescuento=desc;
		autoresOferta= aut;
	}
	public void setOferta(double desc, String[] aut) {
		porcDescuento=desc;
		autoresOferta=aut;
	}
	
}
