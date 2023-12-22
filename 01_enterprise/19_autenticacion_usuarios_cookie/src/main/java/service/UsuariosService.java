package service;

import java.util.ArrayList;
import java.util.List;

import model.Usuario;

public class UsuariosService {
	List<Usuario> usuarios = new ArrayList<>(List.of(
			new Usuario("user1","pwd1"),
			new Usuario("user2","pwd2"),
			new Usuario("user3","pwd3"),
			new Usuario("user4","pwd4"),
			new Usuario("user5","pwd5"),
			new Usuario("user6","pwd6"),
			new Usuario("user7","pwd7")			
			));
	
	public boolean autenticar(String usuario, String pwd) {
		return usuarios.stream()
				.anyMatch(x -> (x.getUsuario().equals(usuario) 
							&& (x.getPassword().equals(pwd))));
	}
}