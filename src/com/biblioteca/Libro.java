package com.biblioteca;

public class Libro extends Recurso implements Prestable{

    public Libro(String nombre, boolean prestado) {
        super(nombre, prestado);
    }

    @Override
    public String toString() {
        return "Libro" + " Nombre: " + this.getNombre() + "\n";
    }

    @Override
    public void prestar() {
        this.prestado = true;
    }

    @Override
    public void devolver() {
        this.prestado = false;

    }
}
