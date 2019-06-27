import java.util.*;
public class PruebaLinkedList {

	public static void main(String[] args) {
		
		LinkedList<String> lista_personas=new LinkedList<String>();
		lista_personas.add("Pepe");
		lista_personas.add("Maria");
		lista_personas.add("Pedro");
		lista_personas.add("Juan");
		lista_personas.add("Pablo");
		
		System.out.println(lista_personas.size());
		
		ListIterator<String> iteracion=lista_personas.listIterator();
		iteracion.next(); //recorro el primer elemento
		iteracion.add("Sandra"); //aqui Sandra se insertará en la 2a posicion pues recorri el primero
		
		
		for(String persona:lista_personas) {  //recorro la lista
			System.out.println(persona);
		}

	}

}
