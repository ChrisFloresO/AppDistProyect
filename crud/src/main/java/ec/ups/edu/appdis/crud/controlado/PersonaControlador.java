package ec.ups.edu.appdis.crud.controlado;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import ec.ups.edu.appdis.crud.datos.PersonaDAO;
import ec.ups.edu.appdis.crud.modelo.Persona;

@ManagedBean
public class PersonaControlador {
	
	private Persona persona;
	
	@Inject
	private PersonaDAO pdao;
	
	@PostConstruct		
	public void init() {
		persona=new Persona();
	}
	
public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

public String Guardar(){
	
	System.out.println(persona);
	//invoque al DAO
	System.out.println("hola mundo");
		pdao.Insertar(persona);
	return null;
}
}
