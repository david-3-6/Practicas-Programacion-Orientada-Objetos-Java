package datos;

public class DatosException extends RuntimeException {
	private String mensage;
	public DatosException() {
		
	}
	public DatosException (String cad) {
		mensage=cad;
	}
	@Override
	public String getMessage() {
		return mensage;
	}
}
