
/**
 * Write a description of class Clientes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cliente
{
    private Identidad id;
    private Descripcion descripcion;
    private EstadoCliente estado;
    public Cliente(Identidad id, Descripcion descripcion, EstadoCliente estado){
        this.id=id;
        this.descripcion= descripcion;
        this.estado= estado;
    }
}
