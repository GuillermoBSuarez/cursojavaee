package service;

import java.util.ArrayList;

import model.Curso;

public class CursosService{
	private static ArrayList<Curso> cursos=new ArrayList<>();
	/* Debe ser static porque si no, cada vez que se ejecuta un servlet, éste
	 * crea un CursosService y, con él, un ArrayList nuevo. Así, cada vez que se graba
	 * un curso, éste se graba en un ArrayList nuevo. Poniéndolo static lo comparten
	 * todas las instancias del service */
	
	public boolean nuevo(String nombre, int duracion, double precio) {		
		Curso curso=new Curso(nombre,duracion,precio);
		for(Curso c:cursos) {
			if(c.getNombre().equals(nombre)) {
				return false;
			}
		}
		cursos.add(curso);
		return true;
	}
	
	public ArrayList<Curso> preciosCursoMax(double precioMax){
		ArrayList<Curso> auxiliar=new ArrayList<>();
		for(Curso c:cursos) {
			if(c.getPrecio()<=precioMax) {
				auxiliar.add(c);
			}
		}
		return auxiliar;
	}
	
	public void eliminarCurso(String nombre) {
		cursos.removeIf(c->c.getNombre().equals(nombre));
	}
	
	public void modificarDuracion(String nombre, int nuevaDuracion) {
		for(Curso c:cursos) {
			if(c.getNombre().equals(nombre)) {
				c.setDuracion(nuevaDuracion);
				break;
			}
		}
	}
}