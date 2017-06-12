
/**
 * Write a description of class Clientes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cliente
{
    private String ci;
    private double peso;
    
    public Cliente(String ci, double peso){
        this.ci=ci;
        if(peso>0){
        this.peso= peso;
       }else{
           peso= 0.0;
        }
       
    }
    
    public double getPeso(){
        
        return peso;
        
    }
    public String getCI(){
        return ci;
    }
    public double entrenar(MaquinasFuerza maquina , double tiempo, Sensor sensor){
        return sensor.calcularCalorias(tiempo, 3);
    }
}
