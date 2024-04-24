package pcshop.modelo;

public class Teclado extends DispositivoDeEntrada{

    //
    private final int id;
    public static int contadorTeclados;

    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.id = ++contadorTeclados;
    }

    @Override
    public String toString() {
        return "Teclado{" +
                "id=" + id +
                "}" + super.toString();
    }

    public int getId() {
        return id;
    }

    public static int getContadorTeclados() {
        return contadorTeclados;
    }

}
