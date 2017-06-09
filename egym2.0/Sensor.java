
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
   
   public boolean comprobarRegistro(Registro r, String ci){
       boolean res= false;
       if(r.buscarCI(ci)!=null){
           cliente= r.buscarCI(ci);
           res= true;
        }
       return res;
       
    }
     public double calcularCalorias(double tiempo, int MET){
         double caloriasQuemadas=0.0;
        if(cliente!=null){
        double peso= cliente.getPeso();
        caloriasQuemadas=  (MET * 3.5 * peso/ 200) * tiempo ;
       }
        return caloriasQuemadas;
   }
}
