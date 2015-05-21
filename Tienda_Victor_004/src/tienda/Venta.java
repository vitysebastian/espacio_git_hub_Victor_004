package tienda;


public class Venta {
	
	private String id_producto;
	private String id_cliente;
	private String id_vendedor;
	private String id_tienda;
	String getId_tienda() {
		return id_tienda;
	}
	void setId_tienda(String id_tienda) {
		this.id_tienda = id_tienda;
	}
	String getId_vendedor() {
		return id_vendedor;
	}
	void setId_vendedor(String id_vendedor) {
		this.id_vendedor = id_vendedor;
	}
	String getId_cliente() {
		return id_cliente;
	}
	void setId_cliente(String id_cliente) {
		this.id_cliente = id_cliente;
	}
	String getId_producto() {
		return id_producto;
	}
	void setId_producto(String id_producto) {
		this.id_producto = id_producto;
	}

}
