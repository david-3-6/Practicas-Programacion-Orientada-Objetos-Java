import datos.*;
import java.util.Arrays;
public class PruebaDatos {
	public static void main (String[] args) {
		try {
			if(args.length<3) {
				System.out.println("Error, no hay valores suficientes");
			}else if((Double.parseDouble(args[0])>=0 || Double.parseDouble(args[0])<0) && (Double.parseDouble(args[1])>=0 || Double.parseDouble(args[1])<0)) {
				Datos datos=new Datos(Arrays.copyOfRange(args,2, args.length),Double.parseDouble(args[0]),Double.parseDouble(args[1]));
				System.out.println(datos.toString());
				datos.setRango("0;4");
				System.out.println(datos.toString());
				datos.setRango("15 25");
				
			}
		}catch(NumberFormatException e) {
			System.out.println("Error, al convertir un valor a número real ("+e.getMessage()+")");
		}
		
		
	}
}
