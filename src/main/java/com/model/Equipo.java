package main.java.com.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Equipo {
	private String nombreEquipo;
	private List<Alumno> conjuntoAlumno = new ArrayList<Alumno>();
	
	public Equipo(String nombreEquipo) {
		this.nombreEquipo=nombreEquipo;
		
	}
	
	//METHODS
	public Boolean annadirALumno(Alumno a1) {
		Boolean resultado=false;

		if (conjuntoAlumno.contains(a1)) {
			throw new EquipoExcepcion("Se ha producido una Excepcion");

		}else {
			conjuntoAlumno.add(a1);
			resultado= true;
			
		}
		return resultado;
	}
		public Boolean borrarAlumno(Alumno a1) {
			Boolean resultado=false;
			
			if (conjuntoAlumno.contains(a1)) {
				conjuntoAlumno.remove(a1);
				resultado=true;
			}else {
				throw new EquipoExcepcion("Se ha producido una Excepcion");
			}
			
			return resultado;
	}
		
		public Alumno encontrarALumno(Alumno a1) {
			if(!conjuntoAlumno.contains(a1)) {
				a1=null;
			}
			return a1;
		}
	
	

}
