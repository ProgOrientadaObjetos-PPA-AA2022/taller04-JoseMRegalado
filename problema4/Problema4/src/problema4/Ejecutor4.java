
package problema4;

public class Ejecutor4 {

    
    public static void main(String[] args) {
        Cheque ch = new Cheque("Juan Pérez");
        Cheque ch2 = new Cheque("John Doe","Banco de Loja",5000);
        ch.establecerNombreBanco("Banco Pichincha");
        ch.establecerValor(15000);
        ch.calcularComision();
        System.out.printf("%s\n", ch);
        ch2.calcularComision();
        System.out.printf("%s\n", ch2);
    }
    
}
