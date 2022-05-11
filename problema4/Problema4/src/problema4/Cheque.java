
package problema4;


public class Cheque {
    private String nombre;
    private String nombreBanco;
    private double valor;
    private double comision;
    public Cheque (String n){
        nombre = n;
        
    }

    public Cheque (String n, String nb, int c){
        nombre = n;
        nombreBanco = nb;
        valor = c;
        
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }

    public void establecerNombreBanco(String n){
        nombreBanco = n;
    }
    public void establecerValor(double n){
        valor = n;
    }
    public void calcularComision(){
        comision = valor * 0.003;
    }
    
    public String obtenerNombre(){
        return nombre;
    }

    public String obtenerNombreBanco(){
        return nombreBanco;
    }
    public double obtenerValor(){
        return valor;
    }
    public double obtenerComision(){
        return comision;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Cheque:\n"
        + "Nombre: %s\nNombre Banco: %s\n"
        + "Valor del Cheque: %.2f \n"
        + "Comisión: %.2f \n"
        
        ,
        obtenerNombre(),
        obtenerNombreBanco(), obtenerValor(),
        obtenerComision());
        return cadena;
    }
}
