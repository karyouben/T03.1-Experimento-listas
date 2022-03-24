package fp.laboratorio.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import fp.laboratorio.ClaseLaboratorio;
import fp.laboratorio.ClaseLaboratorioImpl;
import fp.laboratorio.Estudiante;
import fp.laboratorio.EstudianteImpl;

public class ExperimentoListas {
	
	
	public static void main(String []args) {
		
		Estudiante e1 = new EstudianteImpl("Ada", "Lovelace", "adalov");  
		Estudiante e2 = new EstudianteImpl ("Grace", "Murray", "gramur");
		Estudiante e3 = new EstudianteImpl ("Frances", "Allen", "fraall");
		Estudiante e4 = new EstudianteImpl("Hedy", "Lamarr", "hedlam");
		Estudiante e5 = new EstudianteImpl ("Radia", "Perlman", "ritper");
		Estudiante e6 = new EstudianteImpl ("Margaret", "Hamilton", "marham");
		ClaseLaboratorio clase = new ClaseLaboratorioImpl(6);
		clase.inscribeEstudiante(e1);
		clase.inscribeEstudiante(e2);
		clase.inscribeEstudiante(e3);
		e4.sumarPuntos(22.0);
		e5.sumarPuntos(14.0);
		e6.sumarPuntos(23.0);
		clase.inscribeEstudiante(e4);
		clase.inscribeEstudiante(e5);
		clase.inscribeEstudiante(e6);
		clase.setAula("A4.30");
		clase.setProfesor("Jane Doe");
		clase.setFechaHora(LocalDateTime.of(2019, Month.FEBRUARY,22,15,30));
		System.out.println(clase);
		
		Estudiante e7 = new EstudianteImpl ("Margaret", "Hamilton", "marham");
		e7.sumarPuntos(23.0);
		System.out.println(e6==e7);
		System.out.println(e6.equals(e7));
		System.out.println(e6.hashCode());
		System.out.println(e7.hashCode());
		System.out.println(e1.hashCode());
		System.out.println(e1.compareTo(e7));	

		
		//Crea una lista vacía de estudiantes
		
	
		//Añade 5 estudiantes (e1-e5) a la lista
		
		//Visualiza el número de estudiantes que tiene la lista

		//Visualiza los estudiantes de las posiciones 0, 1 y 5.
		
		//Visualiza, de los estudiantes 2 y 4 solo su uvus.
		
		//Inserta el estudiante e6 como tercer estudiante de la lista
		
		//Busca la posición de la estudiante que se llama Frances Allen.

		//Obten una sublista con los estudiantes de la posición 1 a la 4.
		
		//Visualiza ambas listas
		
		//Elimina de la sublista el segundo estudiante (índice 1).
		//Muestra ambas listas.
		
//		sublista.clear();
//      Set<Estudiante> union = new HashSet<Estudiante>(s1);
//		union.addAll(s2);

	}

}
