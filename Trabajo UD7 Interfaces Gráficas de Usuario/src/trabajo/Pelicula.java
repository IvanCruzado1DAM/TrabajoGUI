package trabajo;

import java.io.Serializable;

public class Pelicula implements Serializable {
	private String nombre, género, año, pais, caratula;

	Pelicula(String nombre, String género, String año, String pais, String caratula) {
		super();
		this.nombre = nombre;
		this.género = género;
		this.año = año;
		this.pais = pais;
		this.caratula = caratula;
	}

	Pelicula() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGénero() {
		return género;
	}

	public void setGénero(String género) {
		this.género = género;
	}

	public String getAño() {
		return año;
	}

	public void setAño(String año) {
		this.año = año;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCaratula() {
		return caratula;
	}

	public void setCaratula(String caratula) {
		this.caratula = caratula;
	}

	@Override
	public String toString() {
		return "Pelicula [nombre=" + nombre + ", género=" + género + ", año=" + año + ", pais=" + pais + ", caratula="
				+ caratula + "]";
	}
	
	

}
