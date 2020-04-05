/* Universidad del Valle de Guatemala
Maria Isabel Montoya 19169
Hoja de Trabajo No. 8
pacientes*/
import java.util.ArrayList; 
import java.util.*;
@SuppressWarnings({ "rawtypes", "unchecked" })

public class pacientes<E extends Comparable<E>>{
    private ArrayList<String> info;
    private ArrayList<String> letras = new ArrayList<String>();
    private ArrayList<String> info2 = new ArrayList<String>();
    private ArrayList<String> order = new ArrayList<String>();
    
    public pacientes(ArrayList<String> patients){
	this.info = patients;
    }
    public VectorHeap result(){
        VectorHeap data = new VectorHeap();
        for(int i=0;i<info.size();i++){
            String letters[] = (info.get(i)).split(",");
            letras.add(letters[0]);
            info2.add(letters[0]);
            info2.add(letters[1]);
        }
        Object array[]= letras.toArray();
        for(int i=0;i<array.length;i++){
            int ubicacion = info2.indexOf(array[i]);
            String informacion = info2.get(ubicacion) + ", "+info2.get(ubicacion+1) +" con: "+info2.get(ubicacion+2);
            order.add(informacion);      
        }
        for(int i=0;i<order.size();i++){
            data.add(order.get(i));
        }
        return data;
    }

}