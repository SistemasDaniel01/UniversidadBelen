/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author planl
 */
public class Materia {
    private int idmateria;
    private String nombre;

    public Materia() {
    }

    public Materia(int idmateria) {
        this.idmateria = idmateria;
    }

    public Materia(int idmateria, String nombre) {
        this.idmateria = idmateria;
        this.nombre = nombre;
    }

    public Materia(String nombre) {
        this.nombre = nombre;
    }

    public int getIdmateria() {
        return idmateria;
    }

    public void setIdmateria(int idmateria) {
        this.idmateria = idmateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
