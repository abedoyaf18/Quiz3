package com.biblioteca;

public abstract class Recurso {
    private String nombre;
    protected boolean prestado;

    public Recurso(String nombre, boolean prestado) {
        this.nombre = nombre;
        this.prestado = prestado;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
}
