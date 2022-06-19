package trabajo;

import java.io.Serializable;

public class Usuario implements Serializable {
	private String username, password, nombre, email;
	private boolean esAdmin, estaactivo;
	
	Usuario(String username, String password, String nombre, String email, boolean esAdmin, boolean estaactivo) {
		super();
		this.username = username;
		this.password = password;
		this.nombre = nombre;
		this.email = email;
		this.esAdmin = esAdmin;
		this.estaactivo = estaactivo;
	}
	Usuario() {
		super();
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public boolean isEsAdmin() {
		return esAdmin;
	}
	public void setEsAdmin(boolean esAdmin) {
		this.esAdmin = esAdmin;
	}
	
	public boolean isEstaactivo() {
		return estaactivo;
	}
	public void setEstaactivo(boolean estaactivo) {
		this.estaactivo = estaactivo;
	}
	@Override
	public String toString() {
		return "Usuario [username=" + username + ", password=" + password + ", nombre=" + nombre + ", email=" + email
				+ ", esAdmin=" + esAdmin + ", estaactivo=" + estaactivo + "]";
	}
	
	

}
