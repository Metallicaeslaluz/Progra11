
/**
 * Write a description of class Dorsalera here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dorsalera extends MaquinasFuerza{
    private String nombreMaquina = "Dorsalera";
    public Dorsalera(){
        zonaTrabajada = "Espalda";
    }
    
    @Override
    public String getZonaTrabajada(){
        return "";
    }
    
    @Override
    public String getNombreMaquina(){
        return nombreMaquina;
    }
}
