import java.util.*;
public class PruebaListaEnlazada {

	public static void main(String[] args) {
		LinkedList<String> paises=new LinkedList<String>();
		LinkedList<String> ciudades=new LinkedList<String>();
		
		paises.add("España");
		paises.add("Mexico");
		paises.add("Colombia");
		paises.add("Peru");
				
		ciudades.add("Madrid");
		ciudades.add("DF");
		ciudades.add("Bogota");
		ciudades.add("Lima");
		
		//System.out.println(paises);
		//System.out.println(ciudades);
		
		ListIterator<String> it_paises=paises.listIterator();
		ListIterator<String> it_ciudades=ciudades.listIterator();
		
		//Mezclo los paises con las capitales
		while(it_ciudades.hasNext()) {
			
			if(it_paises.hasNext()) {
				it_paises.next();
				it_paises.add(it_ciudades.next());
			}
		}		
		System.out.println(paises);
		
		//Ahora borro las ciudades pares, pero recordar que el iterador se quedo al final		
		it_ciudades=ciudades.listIterator(); //se reinicia el iterador
		
		while(it_ciudades.hasNext()) {
			it_ciudades.next();  //brinco el primero
			if(it_ciudades.hasNext()) { //agarro el primer par
				it_ciudades.next();
				it_ciudades.remove();
			}	
		}
		
		System.out.println(ciudades);
		
		//Ahora borramos de paises las ciudades que aun quedan en la lista de ciudades, directo de la coleccion
		paises.removeAll(ciudades);
		System.out.println(paises);
	}

}
