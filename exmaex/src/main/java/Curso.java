/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TOSHIBA
 */
public class Curso {

    private Estudiante[] estudiantes;
    private int countEst;

    public Curso() {
        this.countEst = 0;
        this.estudiantes = new Estudiante[10];
    }

    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    public void matriculaEstudiante(Estudiante nuevoEst) {
        if (this.countEst < 10) {
            this.estudiantes[this.countEst++] = nuevoEst;
        } else {
            System.out.println("Curso sin cupos para matricula de estudiantes....");
        }
    }

    public void listaCurso() {
        int i = 0;
        for (Estudiante e : this.estudiantes) {
            i++;
            System.out.println(i + ". --> " + e + "\t (edad : " + e.obtenerEdad() + ")");
        }
    }
}


