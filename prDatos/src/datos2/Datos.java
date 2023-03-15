package datos2;
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
	public double calcMedia () throws DatosException {
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
			throw new DatosException("No hay datos en el rango especificado");
		}
		return res;
	}
	public double calcDesvTipica() throws DatosException {
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
	public void setRango(String rang) throws DatosException {
		
		try {
			int c=rang.indexOf(';');
			String mini=rang.substring(0, c);
			String maxi=rang.substring(c+1);
			min=Double.parseDouble(mini);
			max=Double.parseDouble(maxi);
		}catch(IndexOutOfBoundsException | NumberFormatException E) {
			throw new DatosException("Error en los datos al establecer el rango");
		}		
	}
	/*public void setRango(String rang) {
		
		int c=rang.indexOf(';');
		if(c<0) {
			throw new DatosException("Error en los datos al establecer el rango");
		}
		String mini=rang.substring(0, c);
		String maxi=rang.substring(c+1);
		try {
			min=Double.parseDouble(mini);
			max=Double.parseDouble(maxi);
		}catch(NumberFormatException E) {
			throw new DatosException("Error en los datos al establecer el rango");
		}		
	}*/
	public List<Double> getDatos(){
		return datos;
		
	}
	public List<String> getErrores(){
		return errores;
	}
	@Override
	public String toString (){
		String cad="Min: "+Double.toString(min)+", Max: "+Double.toString(max)+", "+datos.toString()+", "+errores.toString()+", Media: ";
		try {
			cad+=Double.toString(calcMedia())+", DesvTipica: ";
			cad+=Double.toString(calcDesvTipica());
		}catch (DatosException e){
			cad+="ERROR, DesvTipica: ERROR";
		}
		
		return cad;
	}
}
