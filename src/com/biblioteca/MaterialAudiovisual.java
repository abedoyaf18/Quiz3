package com.biblioteca;

public class MaterialAudiovisual extends Recurso {


    public MaterialAudiovisual(String nombre, boolean prestado) {
        super(nombre, prestado);
    }

    @Override
    public String toString() {
        return "Materia Audiovisual" + " Nombre: " + this.getNombre() + " !!!No se puede prestar¡!!\n";
    }
}
