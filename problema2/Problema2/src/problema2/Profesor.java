/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

public class Profesor {

    private String nombre;
    private String apellido;
    private double sueldobasico;
    private double sueldototal;
    private String cedula;

    public Profesor (String n,String a){
        nombre = n;
        apellido = a;
    }

    public Profesor (String n, String a, double sb, String c){
        nombre = n;
        apellido = a;
        sueldobasico = sb;
        cedula = c;
    }

    public void establecerNombre(String n){
        nombre = n;
    }

    public void establecerApellido(String n){
        apellido = n;
    }
    public void establecerSueldoBasico(double n){
        sueldobasico = n;
    }
    public void calcularSueldoTotal(){
        sueldototal = sueldobasico + (sueldobasico * 0.2);
    }
    public void establecerCedula(String n){
        cedula = n;
    }
    
    
    public String obtenerNombre(){
        return nombre;
    }

    public String obtenerApellido(){
        return apellido;
    }
    public double obtenerSueldoBasico(){
        return sueldobasico;
    }
    public double obtenerSueldoTotal(){
        return sueldototal;
    }
    public String obtenerCedula(){
        return cedula;
    }
    
    

    @Override
    public String toString() {
        String cadena = String.format("Profesor:\n"
        + "Nombre: %s\nApellido: %s\n"
        + "Sueldo básico: %.2f \n"
        + "Sueldo total: %.2f \n"
        + "Cédula: %s \n"
        ,
        obtenerNombre(),
        obtenerApellido(), obtenerSueldoBasico(),
        obtenerSueldoTotal(), obtenerCedula());
        return cadena;
    }
    
    
    
    
    
    
}
