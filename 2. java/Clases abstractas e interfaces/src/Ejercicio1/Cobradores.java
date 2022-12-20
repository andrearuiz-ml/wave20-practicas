package Ejercicio1;

public class Cobradores extends Usuarios {
    public Cobradores(String nombre, String apellido) {
        super(nombre,apellido);
    }

    public void realizarConsultaDeSaldo() {
        ConsultaSaldo nuevaT = new ConsultaSaldo();
        // Aquí debería verificar que la cuenta exista para colocar el 1 o 0.
        nuevaT.realizarConsultaSaldo(1);
    }

    public void realizarRetiroDeEfectivo(int cantidadDineroRetirar) {
        RetiroDeEfectivo nuevaT = new RetiroDeEfectivo();
        // Aquí debería verificar que la cuenta exista para colocar el 1 o 0.
        nuevaT.realizarRetiroDeDinero(cantidadDineroRetirar);
    }
}