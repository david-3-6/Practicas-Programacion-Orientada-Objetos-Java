import jarras.Jarra;
public class EjemploUsoJarras1 {
	private static void show (Jarra jarraA, Jarra jarraB) {
		String A, B;
		A=jarraA.toString();
		B=jarraB.toString();
		System.out.println(A+", "+B);
	}
	public static void main(String [] args) {
		Jarra jarraA= new Jarra(7);
		Jarra jarraB= new Jarra(4);
		
		//llenar jarra A
		jarraA.llena();
		show(jarraA, jarraB);
		
		//volcar A sobre B
		jarraB.llenaDesde(jarraA);
		show(jarraA, jarraB);
		
		//vaciar B
		jarraB.vacia();
		show(jarraA, jarraB);
		
		//volcar A sobre B
		jarraB.llenaDesde(jarraA);
		show(jarraA, jarraB);
		
		
	}
	
}
