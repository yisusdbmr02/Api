package net.azarquiel.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Usuarios implements Serializable{
	    private static final long serialVersionUID = 1L;
	    @Id
	    private int id;
	    private String nombre;
	    private String apellido1;
	    private String apellido2;
	    private String estado;
		private Date fechaNacimiento;
	    private String genero;
	    private String login;
	    private String password;
	    private String telefono;
	    
	    
	    public Usuarios() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
		public Usuarios(int id, String nombre, String apellido1, String apellido2, String estado, Date fechaNacimiento,
				String genero, String login, String password, String telefono) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.apellido1 = apellido1;
			this.apellido2 = apellido2;
			this.estado = estado;
			this.fechaNacimiento = fechaNacimiento;
			this.genero = genero;
			this.login = login;
			this.password = password;
			this.telefono = telefono;
		}

		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getApellido1() {
			return apellido1;
		}
		public void setApellido1(String apellido1) {
			this.apellido1 = apellido1;
		}
		public String getApellido2() {
			return apellido2;
		}
		public void setApellido2(String apellido2) {
			this.apellido2 = apellido2;
		}
		public String getEstado() {
			return estado;
		}
		public void setEstado(String estado) {
			this.estado = estado;
		}
		public Date getFechaNacimiento() {
			return fechaNacimiento;
		}
		public void setFechaNacimiento(Date fechaNacimiento) {
			this.fechaNacimiento = fechaNacimiento;
		}
		public String getGenero() {
			return genero;
		}
		public void setGenero(String genero) {
			this.genero = genero;
		}
		public String getLogin() {
			return login;
		}
		public void setLogin(String login) {
			this.login = login;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getTelefono() {
			return telefono;
		}
		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}

		@Override
		public String toString() {
			return "Usuarios [id=" + id + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2
					+ ", estado=" + estado + ", fechaNacimiento=" + fechaNacimiento + ", genero=" + genero + ", login="
					+ login + ", password=" + password + ", telefono=" + telefono + "]";
		}
		
}


