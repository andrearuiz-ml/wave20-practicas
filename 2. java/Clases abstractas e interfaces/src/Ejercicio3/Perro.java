package Ejercicio3;

public class Perro extends Animal implements ICarnivoro {
    String nombre;

    public Perro(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void emitirSonidos() {
        System.out.println("GUUAAAUUUUUUU");
    }

    @Override
    public void comerCarne() {
        System.out.println("Comiendo carne...");
    }
}