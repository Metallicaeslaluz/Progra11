
/**
 * Write a description of class Bicicleta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BancoPress extends MaquinasFuerza
{
    private String nombreMaquina = "Banco Press";
    
    public BancoPress(){
        zonaTrabajada = "Parte superior del tronco";
    }
    
    public String getZonaTrabajada(){
        return "";
    }
    
    @Override
    public String getNombreMaquina(){
        return nombreMaquina;
    }
}