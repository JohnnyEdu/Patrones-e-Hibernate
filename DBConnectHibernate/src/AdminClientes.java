import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entities.Cliente;

public class AdminClientes {
	private static SessionFactory factory;
	public static void main(String[] args) {
		try {
			factory = new Configuration().configure().buildSessionFactory();
		} catch (Throwable ex) {
			System.out.println("No se pudo crear la sesión");
			throw new ExceptionInInitializerError(ex);
		}
		
		Cliente cliente = new Cliente();
		cliente.setDni(40768107);
		cliente.setNombre("Jonathan");
		cliente.setEdad(22);
		
		insertOrUpdateCliente(cliente);
		System.out.println(selectCliente(40768107).toString());
		
		cliente.setDni(40768107);
		cliente.setNombre("Eduardo");
		cliente.setEdad(19);
		
		insertOrUpdateCliente(cliente);
		System.out.println(selectCliente(40768107).toString());
		
	}
	
	public static Cliente selectCliente(Integer id){
		Session sesion = factory.openSession();
		Cliente cliente = null;
		try{
			cliente = sesion.get(Cliente.class, id);
		}catch(HibernateException ex){
			ex.printStackTrace();
		}
		return cliente;
	}
	
	public static void insertOrUpdateCliente(Cliente cliente){
		Session sesion = factory.openSession();
		try{
			Transaction transaccion =sesion.beginTransaction();
			sesion.saveOrUpdate(cliente);
			transaccion.commit();
		}catch(HibernateException ex){
			ex.printStackTrace();
		}
	}
	public static void deleteCliente(Cliente cliente){
		Session sesion = factory.openSession();
		try{
			Transaction transaccion =sesion.beginTransaction();
			sesion.delete(cliente);
			transaccion.commit();
		}catch(HibernateException ex){
			ex.printStackTrace();
		}
	}
}
