package trabajo;

import java.io.Serializable;

public class Pelicula implements Serializable {
	private String nombre, g�nero, a�o, pais, caratula;

	Pelicula(String nombre, String g�nero, String a�o, String pais, String caratula) {
		super();
		this.nombre = nombre;
		this.g�nero = g�nero;
		this.a�o = a�o;
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

	public String getG�nero() {
		return g�nero;
	}

	public void setG�nero(String g�nero) {
		this.g�nero = g�nero;
	}

	public String getA�o() {
		return a�o;
	}

	public void setA�o(String a�o) {
		this.a�o = a�o;
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
		return "Pelicula [nombre=" + nombre + ", g�nero=" + g�nero + ", a�o=" + a�o + ", pais=" + pais + ", caratula="
				+ caratula + "]";
	}
	
	

}
