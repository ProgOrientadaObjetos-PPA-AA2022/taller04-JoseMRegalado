
package problema2;


public class Ejecutor2 {
    public static void main(String[] args) {
        Profesor pr = new Profesor("Pedro","Benítez");
        Profesor pr2 = new Profesor("Juan","Pérez",300,"1104857094");
        pr.establecerSueldoBasico(400.5);
        pr.establecerCedula("1105789367");
        pr.calcularSueldoTotal();
        System.out.printf("%s\n", pr);
        pr2.calcularSueldoTotal();
        System.out.printf("%s\n", pr2);
    }
}
