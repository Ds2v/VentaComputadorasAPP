package pcshop.servicio;

import pcshop.modelo.Computadora;

import java.util.ArrayList;
import java.util.List;

public class Orden {

    //
    private final int id;
    private final List<Computadora> computadoras;
    public static int contadorOrdenes;

    public Orden() {
        this.id = ++contadorOrdenes;
        computadoras = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Orden{" +
                "id=" + id +
                ", computadoras=" + computadoras +
                '}';
    }

    public void agregarComputadora(Computadora computadora){
        computadoras.add(computadora);
    }
    public void mostrarOrden(){
        System.out.println("Orden #: " + id);
        System.out.println("Total computadoras: " + computadoras.size());
        computadoras.forEach(System.out::println);
        System.out.println();
    }
}
