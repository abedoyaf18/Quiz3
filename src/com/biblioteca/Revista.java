package com.biblioteca;

public class Revista extends Recurso implements Prestable{
    public Revista(String nombre, boolean prestado) {
        super(nombre, prestado);
    }
    @Override
    public String toString() {
        return "Revista" + " Nombre: " + this.getNombre() + "\n";
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
