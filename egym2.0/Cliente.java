
/**
 * Write a description of class Clientes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cliente
{
    private String ci;
    //private double peso;
    private EstadoCliente estado;
    public Cliente(String ci, EstadoCliente estado){
        this.ci=ci;
        
        this.estado= estado;
    }
    
    public double getPeso(){
        return 0;
    }
    public String getCI(){
        return "";
    }
    public double entrenar(MaquinasFuerza maquina , double tiempo, Sensor sensor){
        return sensor.calcularCalorias(tiempo);
    }
}
