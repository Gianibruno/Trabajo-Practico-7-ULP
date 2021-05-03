/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo.practico.pkg7;

/**
 *
 * @author giani
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Materia m1=new Materia(1,"Ingles I",1);
        Materia m2=new Materia(2,"Matematica",1);
        Materia m3=new Materia(3,"Laboratorio I",1);
        Alumno a1=new Alumno(1001,"López","Martin");
        Alumno a2=new Alumno(1002,"Martinez","Brenda");
        a1.agregarMaterias(m1);
        a1.agregarMaterias(m2);
        a1.agregarMaterias(m3);
        a2.agregarMaterias(m1);
        a2.agregarMaterias(m2);
        a2.agregarMaterias(m3);
        a2.agregarMaterias(m3);
        a1.cantidadMaterias();
        a2.cantidadMaterias();
    }
    
}
