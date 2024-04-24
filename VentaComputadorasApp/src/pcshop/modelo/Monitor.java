package pcshop.modelo;

public class Monitor {

    //
    private final int id;
    private String marca;
    private int tamanio;
    public static int contadorMonitores;

    private Monitor(){
        this.id = ++contadorMonitores;
    }
    public Monitor(String marca, int tamanio) {
        this(); //Aqui estamos mandando a llamar el constructor private
        this.marca = marca;
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", tamanio=" + tamanio +
                '}';
    }

    public int getId() {
        return id;
    }

    public static int getContadorMonitores() {
        return contadorMonitores;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
}
