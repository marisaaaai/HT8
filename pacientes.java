/* Universidad del Valle de Guatemala
Maria Isabel Montoya 19169
Hoja de Trabajo No. 8
pacientes*/
//se importan os arrays que se van a usar
import java.util.ArrayList; 
import java.util.*;
@SuppressWarnings({ "rawtypes", "unchecked" })

public class pacientes<E extends Comparable<E>>{
    //se instancian los arrys que iran a ser usados en la clase
    private ArrayList<String> info;
    private ArrayList<String> letras = new ArrayList<String>();
    private ArrayList<String> info2 = new ArrayList<String>();
    private ArrayList<String> order = new ArrayList<String>();
    //se crea el constructor
    public pacientes(ArrayList<String> patients){
	this.info = patients;
    }
    //pre: info is not empty
    //post: returns a vector with a the priorities sorted
    public VectorHeap result(){
        //instance de vectorHeap
        VectorHeap data = new VectorHeap();
        for(int i=0;i<info.size();i++){
            //separete de priority of the name and the sickness
            String letters[] = (info.get(i)).split(",");
            //add to the array the letters of priority
            letras.add(letters[0]);
            info2.add(letters[0]);
            info2.add(letters[1]);
        }
        //sort the letters
        Collections.sort(letras);
        for(int i=0;i<letras.size();i++){
            int ubicacion = info2.indexOf(letras.get(i));
            String informacion = info2.get(ubicacion) + ", "+info2.get(ubicacion+1);
            order.add(informacion);      
        }
        for(int i=0;i<order.size();i++){
            data.add(order.get(i));
        }
        return data;
    }

}