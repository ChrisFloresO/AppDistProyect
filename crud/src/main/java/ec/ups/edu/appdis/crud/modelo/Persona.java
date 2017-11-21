package ec.ups.edu.appdis.crud.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
@Entity
@Table(name="tbl_persona")
public class Persona {
	
	@Id
	@Column(name="per_cedula",length=10)
	private String cedula;
	
	@NotNull
	@Size(min=4,max=20)
	@Column(name="per_nombre")
	private String nombre;
	
	@Email
	@Column(name="per_email")
	private String email;
	
	@Temporal(TemporalType.DATE)
	@Column(name="per_fechaNa")
	private Date fechaNa;
	
	
	
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getFechaNa() {
		return fechaNa;
	}
	public void setFechaNa(Date fechaNa) {
		this.fechaNa = fechaNa;
	}
	@Override
	public String toString() {
		return "Persona [cedula=" + cedula + ", nombre=" + nombre + ", email=" + email + ", fechaNa=" + fechaNa + "]";
	}

}
