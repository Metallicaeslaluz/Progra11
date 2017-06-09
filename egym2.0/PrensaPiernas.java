
/**
 * Write a description of class PrensaPiernas here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PrensaPiernas extends MaquinasFuerza
{
    private String zonaDelCuerpo;
   public PrensaPiernas(){
        sensor= new Sensor();
        zonaDelCuerpo= "piernas";
    }
   
    public String zonaTrabajadaDelCuerpo(){
        return "";
    }
}
