
/**
 * Write a description of class Sensor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sensor{
    private Cliente cliente;
    public Sensor(){
        cliente = null;
    }

    public boolean comprobarRegistro(Registro r,String ci){;  
        boolean res = false;
        cliente = r.buscarCI(ci);
        if(cliente != null)
            res = true;
        return res;
    }

    public double calcularCalorias(double tiempo){
        return 0.0;
    }

    public void logout(){
        cliente = null;
    }
}