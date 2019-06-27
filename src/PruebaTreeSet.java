import java.util.*;
public class PruebaTreeSet {

	public static void main(String[] args) {
		/*TreeSet<String> arbolPersonas= new TreeSet<String>();
		arbolPersonas.add("Jose");
		arbolPersonas.add("Sandra");
		arbolPersonas.add("Adrian");
		arbolPersonas.add("Felipe");
		arbolPersonas.add("Putricia");
		System.out.println(arbolPersonas);*/
		
		Articulo art1=new Articulo(2,"Clavo");
		Articulo art2=new Articulo(1,"Tornillo");
		Articulo art3=new Articulo(3,"Tuerca");
		TreeSet<Articulo> articulos=new TreeSet<Articulo>();
		articulos.add(art1);
		articulos.add(art2);
		articulos.add(art3);
		for(Articulo art:articulos) {
			System.out.println(art.getDesc());
		}
			
		/*************Segunda opcion con Comparator ordena alfabeticamente ***********************/
		//Articulo comparadorArticulo=new Articulo();
		//TreeSet<Articulo> ordenArticulos2=new TreeSet<Articulo>(comparadorArticulo); //aqui agrego el comparator
		
		/*************Tercera opcion con Comparator ordena alfabeticamente ***********************/
		ComparadorArticulos compara_art=new ComparadorArticulos();
		TreeSet<Articulo> ordenArticulos2=new TreeSet<Articulo>(compara_art); //aqui agrego el comparator
		
		ordenArticulos2.add(art1);
		ordenArticulos2.add(art2);
		ordenArticulos2.add(art3);
		for(Articulo a: ordenArticulos2) {
			System.out.println(a.getDesc());
		}
	}

}

class Articulo implements Comparable<Articulo>{ //, Comparator<Articulo>{
	int id;
	String desc;
	/*public Articulo() {  //uso este contructor para el comparador que no me puda parametros
		
	}*/
	
	public Articulo(int id, String desc) {
		this.id=id;
		this.desc=desc;
	}
	
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public int compareTo(Articulo o) {
		// TODO Auto-generated method stub
		return this.id - o.id;  //sobreescribo el metodo
	}

	//@Override
	/*public int compare(Articulo o1, Articulo o2) { //metodo a sobreescribir de comparator		
		return o1.getDesc().compareTo(o2.getDesc());  //comparo las 2 descripciones
	}*/
	
}

//hacemos la 3a opcion creando una clase de comparador
class ComparadorArticulos implements Comparator<Articulo> {
	
	@Override
	public int compare(Articulo o1, Articulo o2) {
		// TODO Auto-generated method stub
		return  o1.getDesc().compareTo(o2.getDesc());
	}
	
}