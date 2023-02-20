package jarras;

public class Jarra {
	//atributos
	private int contenido;
	private final int capacidad;
	//constructor
	public Jarra(int cant) {
		if(cant<=0) {
			throw new RuntimeException("Capacidad introducida<=0");
		}else {
			contenido=0;
			capacidad=cant;
		}
	}
	//metodos
	public int capacidad () {
		return capacidad;
	}
	public int contenido() {
		return contenido;
	}
	public void llena() {
		contenido=capacidad;
	}
	public void vacia() {
		contenido=0;
	}
	public void llenaDesde (Jarra jar) {
		if(jar==this) {
			throw new RuntimeException("Jarra introducida igual a la llamada");
		}else {
			if((capacidad-contenido)<=jar.contenido()) {
				jar.contenido=jar.contenido-(capacidad-contenido);
				this.llena();
			}else {
				contenido=jar.contenido+contenido;
				jar.vacia();
			}
		}
	}
	public String toString() {
		return "J("+capacidad+","+contenido+")";
	}
	
}
