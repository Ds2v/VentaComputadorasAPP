import pcshop.modelo.Computadora;
import pcshop.modelo.Monitor;
import pcshop.modelo.Raton;
import pcshop.modelo.Teclado;
import pcshop.servicio.Orden;

public class VentaComputadoraApp {
    public static void main(String[] args) {
        
        //
        Raton raton1 = new Raton("BT", "Dell");
       // System.out.println("raton1 = " + raton1);
        Teclado teclado1 = new Teclado("BT", "Dell");
        //System.out.println("teclado1 = " + teclado1);
        Monitor monitor1 = new Monitor("Dell", 27);
        //System.out.println("monitor1 = " + monitor1);
        Raton raton2 = new Raton("BT", "Lenovo");
        Teclado teclado2 = new Teclado("BT", "Lenovo");
        Monitor monitor2 = new Monitor("Lenovo", 27);
        Raton raton3 = new Raton("BT", "HP");
        Teclado teclado3 = new Teclado("BT", "HP");
        Monitor monitor3 = new Monitor("HP", 27);

        Computadora computadora1 = new Computadora("Dell", monitor1, teclado1, raton1);
        //System.out.println("computadora1 = " + computadora1);
        Computadora computadora2 = new Computadora("Lenovo", monitor2, teclado2, raton2);
        Computadora computadora3 = new Computadora("HP", monitor3, teclado3, raton3);

        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadora1);
        orden1.agregarComputadora(computadora2);
        orden1.mostrarOrden();

        Orden orden2 = new Orden();
        orden2.agregarComputadora(computadora3);
        orden2.mostrarOrden();
    }
}
