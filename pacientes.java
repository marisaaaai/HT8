/* Universidad del Valle de Guatemala
Maria Isabel Montoya 19169
Hoja de Trabajo No. 8
pacientes*/
import java.util.ArrayList; 
import java.util.*;

public class pacientes{
    private ArrayList<String> info;
	
    public pacientes(ArrayList<String> patients){
	this.info = patients;
        VectorHeap data = new VectorHeap();
    }
    public Vector<String> result(){
        for(int i=0;i<info.size();i++){
            data.add(info.get(i));
        }
        return data;
    }

}