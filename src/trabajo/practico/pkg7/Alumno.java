/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo.practico.pkg7;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author giani
 */
public class Alumno {

    private int legajo;
    private String apellido;
    private String nombre;
    private List<Materia> materias=new ArrayList<>();

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }
     public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public int agregarMaterias(Materia materia) {
        if (materias.stream().anyMatch(m -> m.getIdMateria()==materia.getIdMateria())) {
            System.out.println("La materia ya existe en la lista.");
            return 0;
        } else {
            materias.add(materia);
            return 1;
        }
    }

    public int cantidadMaterias() {
        System.out.println("La cantidad de materias es: "+materias.size());
        return materias.size();
    }
}
