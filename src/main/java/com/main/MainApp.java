package main.java.com.main;

import main.java.com.model.Alumno;
import main.java.com.model.Equipo;

public class MainApp {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		Equipo eq1 = new Equipo<>();
		eq1.annadirALumno(new Alumno("AABBCCDD", "Juan Carlos"));
		eq1.annadirALumno(new Alumno("SOLECFGH", "Pepe"));
	
		

	}

}
