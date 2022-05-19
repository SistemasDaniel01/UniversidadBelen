/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author planl
 */
public class EstudianteNotas {
    
    private int idest;
    private int idmat;
    private double nota1;
    private double nota2;
    private double nota3;

    public EstudianteNotas(int idest, int idmat, double nota1, double nota2, double nota3) {
        this.idest = idest;
        this.idmat = idmat;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public EstudianteNotas() {
    }

    public EstudianteNotas(int idest, int idmat) {
        this.idest = idest;
        this.idmat = idmat;
    }

    public EstudianteNotas(double nota1, double nota2, double nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public int getIdest() {
        return idest;
    }

    public void setIdest(int idest) {
        this.idest = idest;
    }

    public int getIdmat() {
        return idmat;
    }

    public void setIdmat(int idmat) {
        this.idmat = idmat;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
    
    
    
    
}
