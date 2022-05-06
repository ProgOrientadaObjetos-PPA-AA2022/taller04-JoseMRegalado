/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema1;


public class Ejecutor {
    public static void main(String[] args) {
        Estudiante es = new Estudiante("Juan");
        Estudiante es2 = new Estudiante("Jorge", 7, 8.7, 9);

        es.establecerMateria1(10);
        es.establecerMateria2(5);
        es.establecerMateria3(7.5);
        es.calcularPromedio();
        System.out.printf("%s\n", es);

        es2.calcularPromedio();
        System.out.printf("%s\n", es2);
    }
}
