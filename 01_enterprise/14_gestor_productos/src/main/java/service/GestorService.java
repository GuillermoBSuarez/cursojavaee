package service;

import java.util.ArrayList;
import java.util.List;

import model.Producto;

public class GestorService {
	static List<Producto> productos = new ArrayList<>(List.of(
			new Producto("nombre 1.1", 1.1, "categoría 1"),
			new Producto("nombre 2.1", 2.1, "categoría 1"),
			new Producto("nombre 3.1", 3.1, "categoría 1"),
			new Producto("nombre 1.2", 1.2, "categoría 2"),
			new Producto("nombre 2.2", 2.2, "categoría 2"),
			new Producto("nombre 3.2", 3.2, "categoría 2"),
			new Producto("nombre 1.3", 1.3, "categoría 3"),
			new Producto("nombre 2.3", 2.3, "categoría 3"),
			new Producto("nombre 3.3", 3.3, "categoría 3")));
	
	public void grabar(Producto producto) {
		if (!productos.stream().anyMatch( p -> p.getNombre().equals(producto))) productos.add(producto);
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
