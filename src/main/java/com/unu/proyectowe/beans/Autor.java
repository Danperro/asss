package com.unu.proyectowe.beans;

public class Autor {

	private int idautor;
	private String nacionalidad;
	private String nombre;

	public Autor(int idautor, String nacionalidad, String nombre) {
		super();
		this.idautor = idautor;
		this.nacionalidad = nacionalidad;
		this.nombre = nombre;
	}

	public Autor() {
		this(0, "", "");
	}

	public int getIdautor() {
		return idautor;
	}

	public void setIdautor(int idautor) {
		this.idautor = idautor;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
