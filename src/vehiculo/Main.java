
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoMunozBergillosPedro2223 miVehiculoMunozBergillosPedro2223;
        int stockActual;
        
        miVehiculoMunozBergillosPedro2223 = new VehiculoMunozBergillosPedro2223("Seat",18000,100);
        operativaVehiculosMunozBergillosPedro2223(miVehiculoMunozBergillosPedro2223, 50); 
    }

    private static void operativaVehiculosMunozBergillosPedro2223(vehiculo.VehiculoMunozBergillosPedro2223 miVehiculoMunozBergillosPedro2223, int cantidad) {
        int stockActual;
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoMunozBergillosPedro2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoMunozBergillosPedro2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculoMunozBergillosPedro2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

}
    
