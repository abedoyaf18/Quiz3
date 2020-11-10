package com.biblioteca;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Biblioteca {
    public static final int RECURSOSDISPONOBLES = 0;
    public static final int RECURSOSPRESTADOS = 1;

    private List<Recurso> recursosDisponibles;
    private List<Recurso> listaPrestados;
    private List<Recurso> listaNoprestados;

    public Biblioteca() {
        this.recursosDisponibles = new ArrayList<>();
        this.listaPrestados = new ArrayList<>();
        this.listaNoprestados = new ArrayList<>();
    }


    public void addRecurso(Recurso r){
        boolean estaPrestado =recursosDisponibles.stream().filter(recursoValidar->recursoValidar.isPrestado()).findAny().isPresent();
        if (!estaPrestado) {
            this.recursosDisponibles.add(r);
        }
    }

    public boolean prestarRecurso(Recurso posiblePrestar){
        if(posiblePrestar instanceof Prestable){
            ((Prestable) posiblePrestar).prestar();
            return true;
        }else {
            System.out.println("El libro no es prestable");
        }
        return false;
    }

    public boolean devolverRecurso(Recurso pretado){
        if(pretado instanceof Prestable){
            ((Prestable) pretado).prestar();
            return false;
        }else {
            System.out.println("El libro no pertenece a la biblioteca");
        }
        return false;
    }

    public void listarPrestados(){
        byte opcionElegida  = (byte) JOptionPane.showOptionDialog(null, "¿Que inventario desea ver?", "Biblioteca UCO", 0, 0,
                null, Arrays.asList("Disponibles", "Prestados").toArray(), null);
        if(opcionElegida == RECURSOSDISPONOBLES){
            listaNoprestados = recursosDisponibles.stream().filter(recursoValidar->!recursoValidar.isPrestado()).collect(Collectors.toList());
                System.out.println(listaNoprestados + " Estos Libros se encuentran disponibles");
        }else {
            listaPrestados = recursosDisponibles.stream().filter(recursoValidar->recursoValidar.isPrestado()).collect(Collectors.toList());
                System.out.println(listaPrestados + " Estos Libros se encuentran Prestados");
        }
    }

    public List<Recurso> getRecursos() {
        return recursosDisponibles;
    }

    public void setRecursos(List<Recurso> recursos) {
        this.recursosDisponibles = recursos;
    }
}
