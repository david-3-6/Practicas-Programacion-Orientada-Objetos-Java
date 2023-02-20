import jarras.*;

public class EjemploUsoMesa1 {
	private static void show(Mesa m) {
		System.out.println(m.toString());
	}
	public static void main(String [] args) {
		Mesa mesa1= new Mesa(7,5);
		
		mesa1.llena(2);
		show(mesa1);
		mesa1.llenaDesde(2);
		show(mesa1);
		mesa1.llena(2);
		show(mesa1);
		mesa1.llenaDesde(2);
		show(mesa1);
		mesa1.vacia(1);
		show(mesa1);
		mesa1.llenaDesde(2);
		show(mesa1);
		mesa1.llena(2);
		show(mesa1);
		mesa1.llenaDesde(2);
		show(mesa1);
		
		
	}
}
