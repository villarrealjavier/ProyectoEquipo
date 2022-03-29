package main.java.com.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Equipo<T> {
	private T nombreEquipo;
	private List<T> listaDeAlumnos = new ArrayList<T>();
	
	public Equipo() {
		
	}
	
	public Equipo(T nombreEquipo) {
		this.nombreEquipo=nombreEquipo;
		
	}
	
	public List<T> getListaAlumno() {
		return listaDeAlumnos;
	}

	public void setListaAlumno(List<T> listaAlumno) {
		this.listaDeAlumnos = listaAlumno;
	}

	//METHODS
	public Boolean annadirALumno(T a1) {
		Boolean resultado=false;

		if (listaDeAlumnos.contains(a1)) {
			throw new EquipoExcepcion("Se ha producido una Excepcion");

		}else {
			listaDeAlumnos.add(a1);
			resultado= true;
			
		}
		return resultado;
	}
		public Boolean borrarAlumno(Alumno a1) {
			Boolean resultado=false;
			
			if (listaDeAlumnos.contains(a1)) {
				listaDeAlumnos.remove(a1);
				resultado=true;
			}else {
				throw new EquipoExcepcion("Se ha producido una Excepcion");
			}
			
			return resultado;
	}
		
		public Alumno encontrarALumno(Alumno a1) {
			if(!listaDeAlumnos.contains(a1)) {
				a1=null;
			}
			return a1;
		}
		
		public List<T> mostrarAlumnoEquipo(List<T> lista) {
			
			return lista;
			
		}
		
		public Equipo unirEquipos(Equipo equipo1){
			Equipo equipoDoble = new Equipo();
			Set<T> conjuntoEquipoUnido = new HashSet<T>();
			List<T> equipoUnido = new ArrayList<T>();
			
			if (equipo1!=null && listaDeAlumnos!=null) {
				conjuntoEquipoUnido.addAll(listaDeAlumnos);
				conjuntoEquipoUnido.addAll(equipo1.listaDeAlumnos);
				equipoUnido.addAll(conjuntoEquipoUnido);
				equipoDoble.setListaAlumno(equipoUnido);
			
			}else {
				throw new EquipoExcepcion("Se ha producido una excepcion");
			}
		
			return equipoDoble;
			
		}
		
		public Equipo interseccionEquipos(Equipo equipo1) {
			Equipo equipoInterseccion = new Equipo();
			List<Alumno> listaInterseccion = new ArrayList<Alumno>();
			if (equipo1!=null) {
		
			for (int i=0;i<listaDeAlumnos.size();i++) {
				if (equipo1.listaDeAlumnos.contains(this.listaDeAlumnos.get(i))) {
					listaInterseccion.add((Alumno) this.listaDeAlumnos.get(i));
				}
			
			}equipoInterseccion.setListaAlumno(listaInterseccion);
			}
			
			return equipoInterseccion;
		}
	
	

}
