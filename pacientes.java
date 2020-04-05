/* Universidad del Valle de Guatemala
Maria Isabel Montoya 19169
Hoja de Trabajo No. 8
pacientes*/
import java.util.ArrayList; 
import java.util.*;
public class pacientes{
    private ArrayList info;
    private VectorHeap<E> data;
	
    public pacientes(ArrayList<String> patients){
	this.info = patients;
        data = new VectorHeap<E>();
    }

}