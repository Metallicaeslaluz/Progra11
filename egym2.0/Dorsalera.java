
/**
 * Write a description of class Dorsalera here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dorsalera extends MaquinasFuerza
{
    private String zonaDelCuerpo;
    public Dorsalera(){
        sensor= new Sensor();
        zonaDelCuerpo= "espalda";
    }
    
    public String zonaTrabajadaDelCuerpo(){
        return "";
    }
}
