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
            
            if(cliente.getCI().equals("")){
                
             }else{
                 usuarios.add(cliente);
                 usuariosCI.add(cliente.getCI());
                }
                
                
            
         
        }
    public Cliente buscarCI(String ci){
       boolean res=false;
        int var=0;
        if(usuariosCI!=null){
        for(int i= 0; i<usuariosCI.size();i++){
            if(usuariosCI.get(i).equals(ci)){
                res=true;
                var=i;
                break;
            }
        }
      }
        if(res){
            return usuarios.get(var);
        }else{
            return null;
        }
     
    }
}
