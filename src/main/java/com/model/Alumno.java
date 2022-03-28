package main.java.com.model;

import java.util.Objects;

public class Alumno {
	private String nombre;
	private String DNI;
	
	
	
	
	//CONSTRUCTOR
	public Alumno() {
		
		
	}
	public Alumno(String DNI,String nombre) {
		this.DNI=DNI;
		this.nombre=nombre;
		
	}
	//getters and setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	
	//TO STRING:
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", DNI=" + DNI + "]";
	}

	//HASHCODE
	@Override
	public int hashCode() {
		return Objects.hash(DNI, nombre);
	}

	//EQUALS
	@Override
	public boolean equals(Object obj) {
		boolean resultado=false;
		Alumno other = (Alumno) obj;
		if (other!=null && other.getDNI()!=null) {
			if (this.getDNI().equalsIgnoreCase(other.getDNI())) {
				resultado=true;
			}
		}
		
	
		return resultado;
	}

}
