/* Universidad del Valle de Guatemala
Maria Isabel Montoya 19169
Hoja de Trabajo No. 8
pacientes*/
import java.util.ArrayList; 
import java.util.*;
@SuppressWarnings({ "rawtypes", "unchecked" })

public class pacientes<E extends Comparable<E>>{
    private ArrayList<String> info;
	
    public pacientes(ArrayList<String> patients){
	this.info = patients;
    }
    public VectorHeap result(){
        VectorHeap data = new VectorHeap();
        for(int i=0;i<info.size();i++){
            data.add(info.get(i));
        }
        return data;
    }

}