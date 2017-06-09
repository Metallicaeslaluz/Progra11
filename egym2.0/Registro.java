import java.util.ArrayList;
/**
 * Write a description of class Registro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Registro
{
    private ArrayList<Cliente> usuarios;
    private ArrayList<String> usuariosCI; 
    public Registro(){
        usuarios= new ArrayList<Cliente> ();
        usuariosCI=new ArrayList<String> ();
    }
    public void añadirUsuario(Cliente cliente){
            usuarios.add(cliente);
            usuariosCI.add(cliente.getCI());
        }
    public Cliente buscarCI(String ci){
        boolean res=false;
        int var=0;
        for(int i= 0; i<usuariosCI.size();i++){
            if(usuariosCI.get(i).equals(ci)){
                res=true;
                var=i;
                break;
            }
        }
        if(res){
            return usuarios.get(var);
        }else{
            return null;
        }
    }
}
