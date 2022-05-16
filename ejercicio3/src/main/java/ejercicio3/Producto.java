package ejercicio3;

public class Producto {
	private String nombre;
	private float precio;
	private int cantidad;
	
	public Producto(String nombre, float precio, int cantidad) {
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
	}
	
	public float precioTotal() {
		return precio * cantidad;
		
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + "]";
	}
	
	
}
