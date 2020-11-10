package com.biblioteca;

    public class Mapa extends Recurso implements Prestable{

        public Mapa(String nombre, boolean prestado) {
            super(nombre, prestado);
        }

        @Override
        public String toString() {
            return "Mapas" + " Nombre: " + this.getNombre() + "\n";
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

