
/**
 * Write a description of class Bicicleta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BancoPress extends MaquinasFuerza
{   
    private String zonaDelCuerpo;
    public BancoPress(){
        sensor= new Sensor();
        zonaDelCuerpo= "parte superior del tronco";
    }
   
    public String zonaTrabajadaDelCuerpo(){
        return "";
    }
}

