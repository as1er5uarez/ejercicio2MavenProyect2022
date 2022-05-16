package ejercicio3;

import java.util.ArrayList;

public class Factura{
	ArrayList <Producto> productos;
	
	
	
	public Factura() {
		productos = new ArrayList<Producto>();
	}

	public void meterProducto(Producto p) {
		this.productos.add(p);
	}
	
	public float totalFactura() {
		for (int i = 0; i > this.productos.size(); i++) {
			return this.productos.get(i).precioTotal();
		}
		return 0;
	}
	
	public float aplicarIva(float iva) {
		float precioConIva = 0;
		for (int i = 0; i > this.productos.size(); i++) {
			precioConIva = (this.productos.get(i).precioTotal() * iva) / 100;
			return precioConIva += this.productos.get(i).precioTotal();
		}
		return 0;
	}
}
