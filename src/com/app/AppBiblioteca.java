package com.app;

import com.biblioteca.*;

import java.util.Arrays;

public class AppBiblioteca {
    public static void main(String[] args) {

        Biblioteca bibliotecaUCO = new Biblioteca();

        Libro libro1 = new Libro("El terror de sexto B ", false);
        Libro libro2 = new Libro("La increible y triste historia de la Candida Erendira y de su abuela desalmada", false);
        Mapa mapa1 = new Mapa("Colombia", false);
        Mapa mapa2 = new Mapa("America", false);
        MaterialAudiovisual pelicula1 = new MaterialAudiovisual("Nuestra Universidad", false);
        MaterialAudiovisual pelicula2 = new MaterialAudiovisual("La region", false);
        Revista revista1 = new Revista("Cosmos", false);
        Revista revista2 = new Revista("A la moda", false);
        Tesis tesis1 = new Tesis("Proyecto de grado sistemas", false);
        Tesis tesis2 = new Tesis("Proyecto de grado industrial", false);

        bibliotecaUCO.addRecurso(libro1);
        bibliotecaUCO.addRecurso(libro2);
        bibliotecaUCO.addRecurso(mapa1);
        bibliotecaUCO.addRecurso(mapa2);
        bibliotecaUCO.addRecurso(pelicula1);
        bibliotecaUCO.addRecurso(pelicula2);
        bibliotecaUCO.addRecurso(revista1);
        bibliotecaUCO.addRecurso(revista2);
        bibliotecaUCO.addRecurso(tesis1);
        bibliotecaUCO.addRecurso(tesis2);

        bibliotecaUCO.prestarRecurso(libro1);
        bibliotecaUCO.prestarRecurso(libro2);
        bibliotecaUCO.prestarRecurso(mapa1);
        bibliotecaUCO.prestarRecurso(mapa2);
        bibliotecaUCO.prestarRecurso(tesis1);
        bibliotecaUCO.prestarRecurso(tesis2);


        System.out.println();
        bibliotecaUCO.listarPrestados();

    }

}
