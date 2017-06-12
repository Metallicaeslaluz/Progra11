
/**
 * Write a description of class Pesas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pesas extends MaquinasFuerza
{
    private String zonaDelCuerpo;
    public Pesas(){
        sensor= new Sensor();
        zonaDelCuerpo= "brazos";
    }
    
    public String zonaTrabajadaDelCuerpo(){
        return zonaDelCuerpo;
    }
}
