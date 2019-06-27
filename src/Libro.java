
public class Libro {
	private String titulo;
	private String autor;
	private int	isbn;
	
	public Libro(String tit, String aut, int id) {
		titulo=tit;
		autor=aut;
		isbn=id;
	}
	
	public String getDatos() {
		return ("El titulo del libro es: " + titulo + ", El Autor es: " + autor + " y su ISBN: " + isbn);
	}
	
	//codigo generado de eclipse para hashcode() y equals

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + isbn;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (isbn != other.isbn)
			return false;
		return true;
	}
	
	/*public boolean equals(Object obj) {
		if(obj instanceof Libro) {
			Libro otro=(Libro) obj;
			if(this.isbn==otro.isbn) {
				return true;						
			}else {
				return false;
			}
		}else {
			return false;
		}
	}*/

	
	
}
