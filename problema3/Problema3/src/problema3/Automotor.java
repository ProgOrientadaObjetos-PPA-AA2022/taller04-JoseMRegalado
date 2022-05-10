
package problema3;


public class Automotor {
    private String cedula;
    private String marca;
    private int anio;
    private double valormatricula;
    public Automotor (String c,String m){
        cedula = c;
        marca = m;
    }

    public Automotor (String c, String m, int a){
        cedula = c;
        marca = m;
        anio = a;
        
    }
    
    public void establecerCedula(String n){
        cedula = n;
    }

    public void establecerMarca(String n){
        marca = n;
    }
    public void establecerAnio(int n){
        anio = n;
    }
    public void calcularValorMatricula(){
        valormatricula = 30000 * 0.002 * (2022-anio);
    }
    
    public String obtenerCedula(){
        return cedula;
    }

    public String obtenerMarca(){
        return marca;
    }
    public int obtenerAnio(){
        return anio;
    }
    public double obtenerValorMatricula(){
        return valormatricula;
    }
    
    

   @Override
    public String toString() {
        String cadena = String.format("Automotor:\n"
        + "Cedula: %s\nMarca: %s\n"
        + "Año: %d \n"
        + "Valor Matrícula: %.2f \n"
        
        ,
        obtenerCedula(),
        obtenerMarca(), obtenerAnio(),
        obtenerValorMatricula());
        return cadena;
    }
    
}
