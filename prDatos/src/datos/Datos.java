package datos;
import java.util.List;
import java.util.ArrayList;
public class Datos {
	private List<Double> datos;
	private List<String> errores;
	double min, max;
	
	public Datos (String[] secDat, double min, double max) {
		this.min=min;
		this.max=max;
		datos= new ArrayList<>();
		errores= new ArrayList<>();
		for(int i=0; i<secDat.length;i++) {
			try {
				datos.add(Double.parseDouble(secDat[i]));
			}catch (NumberFormatException E){
				errores.add(secDat[i]);
			}
		}
	}
	public double calcMedia() {
		int cont=0;
		double res=0;
		for(int i=0; i<datos.size();i++) {
			if(datos.get(i)>=min && datos.get(i)<=max) {
				cont++;
				res+=datos.get(i);
			}
			
		}
		if(cont>0) {
			res=res/cont;
		}else {
			throw new DatosException();
		}
		return res;
	}
	public double calcDesvTipica() {
		double media=calcMedia();
		int cont=0;
		double res=0;
		for(int i=0; i<datos.size();i++) {
			if(datos.get(i)>=min && datos.get(i)<=max) {
				cont++;
				res+=Math.pow(datos.get(i)-media,2);
			}
			
		}
		
		return Math.sqrt(res/cont);
	}
	public void setRango(String rang) {
		try {
			String mini=rang.substring(0, rang.indexOf(';')), maxi=rang.substring(rang.indexOf(';')+1,rang.length());
			min=Double.parseDouble(mini);
			max=Double.parseDouble(maxi);
			
		}catch(NumberFormatException |StringIndexOutOfBoundsException e){
			try {
				throw new DatosException("Error en los datos al establecer el rango");
			}catch(DatosException E){
				System.out.println(E.getMessage());
			}
			
		}
		
		
		
	}
	public List<Double> getDatos(){
		return datos;
		
	}
	public List<String> getErrores(){
		return errores;
	}
	@Override
	public String toString () {
		boolean hacer=true;
		String cad="Min: "+Double.toString(min)+", Max: "+Double.toString(max)+", "+datos.toString()+", "+errores.toString()+", Media: ";
		try {
			cad+=Double.toString(calcMedia())+", DesvTipica: ";
		}catch (DatosException e){
			cad+="ERROR, DesvTipica: ERROR";
			hacer=false;
		}
		if(hacer) {
			cad+=Double.toString(calcDesvTipica());
		}
		
		return cad;
	}
}
