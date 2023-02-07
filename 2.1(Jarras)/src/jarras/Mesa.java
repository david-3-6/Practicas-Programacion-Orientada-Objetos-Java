package jarras;

public class Mesa {
	Jarra jarra1;
	Jarra jarra2;
	//----------------------
	public Mesa (int uno, int dos){
		jarra1= new Jarra(uno);
		jarra2= new Jarra(dos);
	}
	
	public Mesa (Jarra uno, Jarra dos) {
		if(uno==dos) {
			throw new RuntimeException ("Las dos jarras son iguales");
		}else {
			jarra1=uno;
			jarra2=dos;
		}
		
	}
	//-----------------------
	public int capacidad (int num) {
		int capacidad;
		switch (num){
			case 1: capacidad=jarra1.capacidad(); break;
			case 2: capacidad=jarra2.capacidad(); break;
			default: throw new RuntimeException ("Jarra no existente");
		}
		return capacidad;
	}
	
	public int contenido (int num) {
		int contenido;
		switch (num){
			case 1: contenido=jarra1.contenido(); break;
			case 2: contenido=jarra2.contenido(); break;
			default: throw new RuntimeException ("Jarra no existente");
		}
		return contenido;
	}
	public void llena (int num) {
		switch (num){
		case 1: jarra1.llena(); break;
		case 2: jarra2.llena(); break;
		default: throw new RuntimeException ("Jarra no existente");
		}
	}
	public void vacia (int num) {
		switch (num){
		case 1: jarra1.vacia(); break;
		case 2: jarra2.vacia(); break;
		default: throw new RuntimeException ("Jarra no existente");
		}
	}
	public void llenaDesde (int num) {
		if (num<1 || num>2){
			throw new RuntimeException("1 o 2");
		}else if (num==1){
			jarra2.llenaDesde(jarra1);
		}else {
			jarra1.llenaDesde(jarra2);
		}
	}
	
	@Override
	public String toString() {
		return "M("+jarra1.toString()+", "+jarra2.toString()+")";
	}
	
}
