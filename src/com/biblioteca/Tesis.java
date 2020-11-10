package com.biblioteca;

public class Tesis extends Recurso {

    public Tesis(String nombre, boolean prestado) {
        super(nombre, prestado);
    }

    @Override
    public String toString() {
        return "Tesis" + " Nombre: " + this.getNombre() + " !!!No se puede prestar¡!!\n";
    }
}
