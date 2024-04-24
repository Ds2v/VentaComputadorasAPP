package pcshop.modelo;

public class Computadora {
    //
    private final int id;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    public static int contadorComputadoras;

    private Computadora() {
        this.id = ++contadorComputadoras;
    }

    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton) {
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "  \n id=" + id +
                ", \n nombre='" + nombre + '\'' +
                ", \n monitor=" + monitor +
                ", \n teclado=" + teclado +
                ", \n raton=" + raton +
                "}" + "\n " ;
    }
}
