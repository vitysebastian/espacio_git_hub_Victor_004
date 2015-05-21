package tienda;

import java.util.Date;


public class Venta {
	
		Date ahora = new Date();
		
		public void nuevaVenta(Clientes cliente1, Productos pro1, Tiendas tien1,
				Vendedores vend1, Date ahora){
			String nuevaVenta;
			nuevaVenta= cliente1+" "+pro1+" "+tien1+" "+vend1+" "+ahora;
			System.out.println(nuevaVenta);
		}
}
