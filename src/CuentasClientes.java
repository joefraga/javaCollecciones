import java.util.*;

public class CuentasClientes {
	
	public static void main(String[] args) {
		Cliente c1=new Cliente("Antonio Banderas", "00001", 20000);
		Cliente c2=new Cliente("Rafael Nadal", "00002", 25000);
		Cliente c3=new Cliente("Penelope Cruz", "00003", 30000);
		Cliente c4=new Cliente("Jose Fraga", "00004", 50000);
		Cliente c5=new Cliente("Lleceli Perez", "00005", 40000);
		Cliente c6=new Cliente("Juan Perez", "00006", 40000);
		
		Set<Cliente> clientes_banco=new HashSet<Cliente>(); //Aqui defino el tipo de coleccion Set con la Interface Hashset
		clientes_banco.add(c1);
		clientes_banco.add(c2);
		clientes_banco.add(c3);
		clientes_banco.add(c4);
		clientes_banco.add(c5);
		clientes_banco.add(c6);
		
		/*for(Cliente cliente:clientes_banco) {
			System.out.println("Cliente: " + cliente.getNombre() + " Cuenta: " + cliente.getCuenta() + " Saldo: " + cliente.getSaldo() );
		}*/
		//voy a reemplazar por un iterator
		Iterator<Cliente> iteracion=clientes_banco.iterator();
		while(iteracion.hasNext()) {
			Cliente cliente;
			cliente=iteracion.next();
			System.out.println("Cliente: " + cliente.getNombre() + " Cuenta: " + cliente.getCuenta() + " Saldo: " + cliente.getSaldo());
		}
	}
	

}
