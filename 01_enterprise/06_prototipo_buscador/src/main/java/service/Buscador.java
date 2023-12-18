package service;

import java.util.ArrayList;
import java.util.List;

import model.Pagina;

public class Buscador {
	List<Pagina> resultados = new ArrayList<>(List.of(
			new Pagina("http://www.fnac.es", "libros", "Libros y más"),
			new Pagina("http://www.mybook.com", "libros", "Libreria de temas varios"),
			new Pagina("http://www.game.es", "juegos", "Juegos variados"),
			new Pagina("http://www.music.es", "musica", "La mejor música"),
			new Pagina("http://www.tech.com", "libros", "Libros técnicos"),
			new Pagina("http://www.eljuego.es", "juegos", "Juegos on-line")));
	
	public List<Pagina> buscar(String tematica){
		return resultados.stream()
				.filter(x->x.getTematica().equals(tematica))
				.toList();
	}
			


}