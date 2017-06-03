import java.util.Scanner;

/**
 * Write a description of class CadenaEx here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CadenaEx{
    public Scanner lector = new Scanner(System.in);
    private String cadena;
    private int tam;
    
    public CadenaEx(){
        cadena = "";
    }
    
    public void main(String[] args){
        cargarString();
        System.out.println(partir());
        System.out.println(getLastChar());
        System.out.println(inversor());
        System.out.println(guiones());
        System.out.println(contarVocales());
        String palabras[] = separarCadena(cadena);
        for(int i=0;i<getCantWords(cadena);i++){
            System.out.println(palabras[i]);
        }
    }
    
    public CadenaEx(String cad){
        cadena = cad;
        tam = cadena.length()-1;
    }

    public void cargarString(){
        System.out.println("Ingrese una cadena: ");
        cadena = lector.nextLine();
        tam = cadena.length()-1;
    }

    //A)
    public String partir(){
        String part;
        part = cadena.substring(0,cadena.length()/2);
        return part;
    }

    //b)
    public char getLastChar(){
        char last;
        last = cadena.charAt(tam); 
        return last;
    }

    //c)
    public String inversor(){
        String inv = "";
        for(int i=tam;i>=0;i--){
            inv = new String(inv + cadena.charAt(i));
        }   
        return inv;
    }

    //d)
    public String guiones(){
        String guiones = "";
        for(int i=0;i<tam;i++){
            guiones = new String(guiones + cadena.charAt(i) + "-");
        }
        guiones = new String(guiones + cadena.charAt(tam));
        return guiones;
    }

    //e)
    public int contarVocales(){
        int vocales = 0;
        char let[] = {'a','e','i','o','u'};
        String cad = cadena.toLowerCase();
        int pos = 0;
        while(pos < cadena.length()){
            char letra = cad.charAt(pos);
            for(int i=0;i<5;i++){
                if(letra == let[i])
                    vocales++;
            }
            pos++;
        }
        return vocales;
    }

    //f)
    public String palindromo(){
        String res = (cadena + " no es un palindromo");
        if(palindromo(cadena))
            res = (cadena + "Es un palindromo)");
        return res;
    }
    
    private boolean palindromo(String pal){
        int tam = cadena.length();
        boolean res = false;
        res = palindromo(pal,0,(tam/2)+1);
        return res;
    }
    
    private boolean palindromo(String pal,int pos,int mit){
        boolean res = false;
        if(pal.charAt(pos) == pal.charAt(pal.length()-pos-1)){
            res = true;
        }
        if(pos != mit){
            res = palindromo(pal,pos+1,mit);
        }
        return res;
    }
    
    //5)
    public String[] separarCadena(String pal){
        int tA = getCantWords(pal)-1;
        String palabras[] = new String[tA+1];
        int pos,posSpc = getPosSpc(0,pal.length(),pal),posSpcAct=0;
        for(pos=0;pos<tA;pos++){
            palabras[pos] = pal.substring(posSpcAct,posSpc);
            posSpcAct = posSpc+1;
            posSpc = getPosSpc(posSpcAct,pal.length(),pal);
        }
        palabras[tA] = pal.substring(posSpcAct,pal.length());
        return palabras;
    }
    
    private int getCantWords(String pal){
        int res = 0;
        for(int i=0;i<pal.length();i++)
            if(pal.charAt(i) == ' ')
                res++; 
        return res+1;
    }
    
    private int getPosSpc(int ini,int end,String pal){
        int res = 0;
        for(int i=ini;i<pal.length();i++){
            if(pal.charAt(i) == ' '){
                res = i;
                i = pal.length();
            }
        }
        return res;
    }
    
    public int chargeAndCountStg(){
        String pal1,pal2;
        System.out.println("Ingrese la primera cadena:");
        pal1 = lector.nextLine();
        System.out.println("Ingrese la segunda cadena:");
        pal2 = lector.nextLine();
        int res = countWordsEquals(pal1,pal2);
        return res;
    }
    
    private int countWordsEquals(String pal1,String pal2){
        int count = 0;
        int cant1 = getCantWords(pal1);
        int cant2 = getCantWords(pal2);
        String lista1[] = separarCadena(pal1);
        String lista2[] = separarCadena(pal2);
        for(int i=0;i<cant1;i++)
            for(int j=0;j<cant2;j++)
                if(lista1[i].equalsIgnoreCase(lista2[j]))
                    count++;
        return count;
    }
    
    public int compararPalabras(){
        int count = 0;
        String[] comp = new String[5];
        String text = "";
        System.out.println("Ingrese un texto.");
        text = lector.nextLine();
        System.out.println("Ingrese 5 palabras para comparar con el texto.");
        for(int i=0;i<5;i++){
            comp[i] = lector.next();
            count = count + countWordsEquals(text,comp[i]);
        }
        return count;
    }
}   