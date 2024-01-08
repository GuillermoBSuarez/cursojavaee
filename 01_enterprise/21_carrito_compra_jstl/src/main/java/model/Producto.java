package model;

public class Producto {
	private String nombre;
	private Double precio;
	private String categoría;
	
	public Producto(String nombre, Double precio, String categoría) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.categoría = categoría;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getCategoría() {
		return categoría;
	}

	public void setCategoría(String categoría) {
		this.categoría = categoría;
	}
}