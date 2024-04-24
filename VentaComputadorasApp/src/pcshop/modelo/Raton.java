package pcshop.modelo;

public class Raton extends DispositivoDeEntrada {

    //
    private final int id;
    private static int contadorRatones;

    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.id = ++contadorRatones;
    }

    @Override
    public String toString() {
        return "Raton{" +
                "id=" + id +
                "}" + super.toString();
    }

    public int getId() {
        return id;
    }

    public static int getContadorRatones() {
        return contadorRatones;
    }

}
