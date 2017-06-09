
/**
 * Write a description of class Sensor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sensor
{
   private Cliente cliente;
   public Sensor(){
       cliente = null;
       
    }
    public double calcularCalorias(double tiempo, int MET){
        double peso= cliente.getPeso();
        double caloriasQuemadas=  MET * 3.5 * peso/ 200 ;
        return caloriasQuemadas;
   }
   public boolean comprobarRegistro(Registro r, String ci){
       boolean res= false;
       if(r.buscarCI(ci)!=null){
           res= true;
        }
       return res;
       
    }
}
