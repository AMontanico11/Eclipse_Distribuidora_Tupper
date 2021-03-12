
public class Main {
       public static void main (String[] args) {

    	   final String nombreEmpresa = "Distribiudora TupperWare";
    	   
    	   double costoUnitario = 35; //Q45.00
    	   int cantidadProducto = 4000;
    	   double totalAPagar = costoUnitario*cantidadProducto; //Q
    	   final double precioDeVenta = 50;
    	   final double IVA = 0.12; //12%
    	   double TotalIVAPorUnidad = precioDeVenta*IVA;
    	   
    	   System.out.println("Costo por unidad: Q"+costoUnitario);
    	   System.out.println("Cantidad de producto: "+cantidadProducto);
    	   System.out.println("--------------------------");
    	   System.out.println("Total: Q"+totalAPagar);
    	   
    	   System.out.println("Venderse a Q"+precioDeVenta);
    	   System.out.println("Impuesto establecido: "+IVA);
    	   System.out.println("Impuesto por unidad: Q" +TotalIVAPorUnidad);
    	   
    	   int cantidadProductoVendido = 60;
    	   double totalcobradoSinDescuento = cantidadProductoVendido *precioDeVenta;
    	   
    	   double tipodeDescuento = 0;
    	   double totalConDescuento = 0;
    	   if (cantidadProductoVendido>=50) {
    	      tipodeDescuento = 0.05;
    	      totalConDescuento = totalcobradoSinDescuento - (totalcobradoSinDescuento*tipodeDescuento);
    	   }
    	   
    	   if (cantidadProductoVendido>=100) {
    	      tipodeDescuento = 0.15;
    	      totalConDescuento = totalcobradoSinDescuento - (totalcobradoSinDescuento*tipodeDescuento);
    	   }
    	   
    	   if (cantidadProductoVendido>=1000) {
     	      tipodeDescuento = 0.25;
     	      totalConDescuento = totalcobradoSinDescuento - (totalcobradoSinDescuento*tipodeDescuento);
     	   }

    	   
    	   double impuestototalADeclarar = totalConDescuento *IVA;
    	   
       	   double ganancias = (totalcobradoSinDescuento - (cantidadProductoVendido*costoUnitario))-impuestototalADeclarar;
       	   
       	   System.out.println("");
           System.out.println("----------------------------");
       	   System.out.println("Cantidad vendida: "+cantidadProductoVendido);
       	   System.out.println("Total sin descuento: Q"+totalcobradoSinDescuento);
       	   System.out.println("Total con descuento: Q"+totalConDescuento);
       	   System.out.println("IVA a declarar: Q"+impuestototalADeclarar);
       	   System.out.println("Tipos de descuento "+ tipodeDescuento);
       	   System.out.println("Ganancia: Q"+ganancias);
    	   
       }
}
