
/**
 * Write a description of class PrensaPiernas here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PrensaPiernas extends MaquinasFuerza
{
    private String nombreMaquina = "Prensa de Piernas";
    public PrensaPiernas(String zonaDelCuerpo){
        zonaTrabajada = "Piernas";
    }

    public String getZonaTrabajada(){
        return "";
    }
    
    @Override
    public String getNombreMaquina(){
        return nombreMaquina;
    }
}
