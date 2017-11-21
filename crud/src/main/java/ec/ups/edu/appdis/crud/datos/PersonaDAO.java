package ec.ups.edu.appdis.crud.datos;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import ec.ups.edu.appdis.crud.modelo.Persona;
@Stateless
public class PersonaDAO {
		
	@Inject	
	private EntityManager em;
		
	public void Insertar(Persona p) {
		em.persist(p);	
	}
	public void actualizar(Persona p) {
		em.merge(p);
	}
	public void borrar(String  cedula) {
		em.remove(leer(cedula));
	}
	public Persona leer(String  cedula) {
		em.find(Persona.class, cedula);
		return null;
	}

}
