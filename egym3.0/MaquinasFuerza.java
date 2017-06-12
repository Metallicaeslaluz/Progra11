
/**
 * Write a description of class MaquinaFuerza here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class MaquinasFuerza
{
    protected Sensor sensor;
    public MaquinasFuerza(){
        sensor= new Sensor();
    }
    
    public abstract String zonaTrabajadaDelCuerpo();
}

