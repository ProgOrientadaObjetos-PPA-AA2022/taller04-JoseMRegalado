/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;


public class Estudiante {

    private String nombre;
    private double materia1;
    private double materia2;
    private double materia3;
    private double promedio;

    public Estudiante (String n){
        nombre = n;
        
    }

    public Estudiante (String n, double m1, double m2, double m3){
        nombre = n;
        materia1 = m1;
        materia2 = m2;
        materia3 = m3;
    }

    public void establecerNombreEstudiante(String n){
        nombre = n;
    }

    public void establecerMateria1(double n){
        materia1 = n;
    }
    public void establecerMateria2(double n){
        materia2 = n;
    }
    public void establecerMateria3(double n){
        materia3 = n;
    }
    public void calcularPromedio(){
        promedio = (materia1 + materia2 + materia3)/3;
    }

    public String obtenerNombreEstudiante(){
        return nombre;
    }

    public double obtenerMateria1(){
        return materia1;
    }
    public double obtenerMateria2(){
        return materia2;
    }
    public double obtenerMateria3(){
        return materia3;
    }
    public double obtenerPromedio(){
        return promedio;
    }

    @Override
    public String toString() {
        String cadena = String.format("Estudiante:\n"
        + "Nombre: %s\n"
        + "Calificacion Materia 1: %.2f \n"
        + "Calificacion Materia 2: %.2f \n"
        + "Calificacion Materia 3: %.2f \n"
        + "Promedio: %.2f \n",
        obtenerNombreEstudiante(),
        obtenerMateria1(), obtenerMateria2(),
        obtenerMateria3(), obtenerPromedio());
        return cadena;
    }
    
}
