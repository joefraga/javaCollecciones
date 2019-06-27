import java. util.*;

public class PruebaMapas {

	public static void main(String[] args) {
		HashMap<String, Empleado> personal=new HashMap<String,Empleado>(); 
		personal.put("001", new Empleado("Juan",1000));
		personal.put("002", new Empleado("Pedro",1000));
		personal.put("003", new Empleado("Jose",1000));
		personal.put("004", new Empleado("Maria",1000));
		
		System.out.println(personal);
		
		//borro el 003
		personal.remove("003");
		System.out.println(personal);
		
		//si trato de meter uno que ya existe lo reemplaza
		personal.put("004", new Empleado("Putricia",1000));
		System.out.println(personal);
		
		//recorriendo la coleccion con la forma Map set
		for(Map.Entry<String, Empleado>entrada:personal.entrySet()) { //defino recorrer la coleccion como entry set
			String clave=entrada.getKey();
			Empleado valor=entrada.getValue();
			System.out.println(clave + ", " + valor);
			
		}
		
	}

}
class Empleado {
	private String nombre;
	private double sueldo;
	public Empleado(String nom,double sue) {
		nombre=nom;
		sueldo=sue;
	}
	public String toString() {
		return "Nombre: " + nombre + " Sueldo: " + sueldo;
	}
}