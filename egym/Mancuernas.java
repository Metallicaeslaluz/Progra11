
/**
 * Write a description of class Pesas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mancuernas extends MaquinasFuerza
{
    private String nombreMaquina = "Mancuernas";

    public Mancuernas(){
        zonaTrabajada = "Brazos";
    }

    public String getZonaTrabajada(){
        return "";
    }
    
    @Override
    public String getNombreMaquina(){
        return nombreMaquina;
    }
}
