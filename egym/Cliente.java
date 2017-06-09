
/**
 * Write a description of class Clientes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cliente
{
    private String ci;
    private EstadoCliente estado;
    public Cliente(String ci, double peso,double estatura){
        this.ci=ci;
        estado = new EstadoCliente(peso,estatura);
    }
    
    public double getPeso(){
        return estado.getPeso();
    }
    
    public double getAltura(){
        return estado.getEstatura();
    }
    
    public String getCI(){
        return "";
    }
}    
    
    
    
    
    
    
    
    
    
    
    
    /*public String entrenar(MaquinasFuerza maquina , double tiempo){
        return maquina.zonaTrabajadaDelCuerpo();
    }
    */

