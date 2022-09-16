public class Instrumento {
    private String ID;
    private double precio;
    private TipoInstrumento tipo;

    public String getID() {
        return ID;
    }

    public Instrumento(String ID, double precio, TipoInstrumento tipo) {
        this.ID = ID;
        this.precio = precio;
        this.tipo = tipo;
    }

    public TipoInstrumento getTipo() {
        return tipo;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Instrumento{" +
                "ID='" + ID + '\'' +
                ", precio=" + precio +
                ", tipo=" + tipo +
                '}';
    }
}
