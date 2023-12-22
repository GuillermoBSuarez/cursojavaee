package service;

import java.util.ArrayList;
import java.util.List;

import model.Producto;

public class GestorService {
	static List<Producto> productos = new ArrayList<>(List.of(
			new Producto("nombre11", 1.1, "categoria1"),
			new Producto("nombre21", 2.1, "categoria1"),
			new Producto("nombre31", 3.1, "categoria1"),
			new Producto("nombre12", 1.2, "categoria2"),
			new Producto("nombre22", 2.2, "categoria2"),
			new Producto("nombre32", 3.2, "categoria2"),
			new Producto("nombre13", 1.3, "categoria3"),
			new Producto("nombre23", 2.3, "categoria3"),
			new Producto("nombre33", 3.3, "categoria3")));
	
	public void grabar(Producto producto) {
		if (!productos.stream().anyMatch( p -> p.getNombre().equals(producto.getNombre()) )) productos.add(producto);
	}

	public List<Producto> productosPorCategoria(String categoria) {
		return productos.stream()
				.filter(p -> p.getCategoría().equals(categoria))
				.toList();
	}
	
	public boolean borrar(String nombre) {
		return productos.removeIf(p -> p.getNombre().equals(nombre));
	}
}