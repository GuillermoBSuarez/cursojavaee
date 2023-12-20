package service;

import java.util.ArrayList;
import java.util.List;

import model.Ficha;
import model.Usuario;

public class UsuariosService {
	List<Usuario> usuarios = new ArrayList<>(List.of(
			new Usuario("user1","pwd1"),
			new Usuario("user2","pwd2"),
			new Usuario("user3","pwd3"),
			new Usuario("user4","pwd4")			
			));
	List<Ficha> fichas = new ArrayList<>(List.of(
			new Ficha("user1", 1, "user1@user1.es"),
			new Ficha("user2", 2, "user2@user2.es"),
			new Ficha("user3", 3, "user3@user3.es"),
			new Ficha("user4", 4, "user4@user4.es")
			));
	
	public boolean autenticar(String usuario, String pwd) {
		return usuarios.stream()
				.anyMatch(x -> (x.getUsuario().equals(usuario) 
							&& (x.getPassword().equals(pwd))));
	}
	
	public Ficha fichaUsuario(String usuario) {
		return fichas.stream()
				.filter(s -> s.getUsuario().equals(usuario))
				.findFirst()
				.orElse(null);
	}

}
