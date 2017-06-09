
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
    public Cliente(String ci, EstadoCliente estado){
        this.ci=ci;
        this.estado= estado;
    }
    
    public String getCI(){
        return "";
    }
    public String entrenar(MaquinasFuerza maquina , double tiempo){
        return maquina.zonaTrabajadaDelCuerpo();
    }
}
