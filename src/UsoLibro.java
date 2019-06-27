
public class UsoLibro {

	public static void main(String[] args) {
		Libro lib1=new Libro("Game of thrones", "Jose Fraga", 104);
		Libro lib2=new Libro("Game of thrones", "Jose Fraga", 103);		
		if(lib1.equals(lib2)) {
			System.out.println("Si es el mismo libro");
			System.out.println(lib1.hashCode());
			System.out.println(lib2.hashCode());
		}else {
			System.out.println("No es el mismo libro");
			System.out.println(lib1.hashCode());
			System.out.println(lib2.hashCode());
		}
			
	}

}
