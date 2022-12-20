public class NoPerecedero extends Producto{

    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public NoPerecedero(String nombre, Double precio, String tipo) {
        super(nombre, precio);
        this.tipo = tipo;
    }


    @Override
    public String toString() {
        return super.toString() + '\n' + "NoPerecedero{" +
                "tipo='" + tipo + '\'' +
                '}';
    }


}