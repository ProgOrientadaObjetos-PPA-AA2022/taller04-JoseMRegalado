
package problema3;


public class Ejecutor3 {
    public static void main(String[] args) {
        Automotor au = new Automotor("1109567832","Mazda");
        Automotor au2 = new Automotor("1105647321","Jeep",2019);
        au.establecerAnio(2015);
        au.calcularValorMatricula();
        System.out.printf("%s\n", au);
        au2.calcularValorMatricula();
        System.out.printf("%s\n", au2);
    }
}
