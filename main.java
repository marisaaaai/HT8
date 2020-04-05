/* Universidad del Valle de Guatemala
Maria Isabel Montoya 19169
Hoja de Trabajo No. 8
main*/
/**
 * Se importan los paquetes que se iran a utilizar
 */
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList; 
import java.util.*; 
/**
 * Se comienza la clase
 * @author maris
 */
public class main{
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[]args){
        //En la dataArrayList se guardaran todos los datos de los pacientes que se ingresen en el txt
	ArrayList<String> dataArrayList = new ArrayList<String>();
	/*
         * Se lee el archivo txt
         */
        Scanner s = null;
	String archive = "pacientes.txt";
	File fichero = new File(archive);
	String linea="";
	try{
            s = new Scanner(fichero);
            while(s.hasNextLine()){
                linea = s.nextLine();
                String data[] = linea.split(",");//se separa la informacion por las comas que tiene el string
                String infoPatient = data[2]+", "+ data[0]+" con "+data[1]; //se reordena el strign como prioridad, nombre y enfermedad
                dataArrayList.add(infoPatient); //se añade el nuevo String al arraylist de la indormacion
            }
	}
        // se toman en cuenta las excepciones si no se encuentra el archivo
	catch(Exception ex){
            System.out.println("Se tuvo el siguiente error: "+ex.getMessage());
	}
	finally{
            try{
		if(s!=null){
                    s.close();
                }
            }
            catch(Exception ex2){
		System.out.println("Se tuvo el error: "+ ex2.getMessage());
            }
	}
        //se comienza la implementacion del JCF
        System.out.println("Implementacion con JCF PriorityQueue:");
        PriorityQueue<String> pQueue = new PriorityQueue<String>();//se instancia el priorityQueue
        for(int i=0;i<dataArrayList.size();i++){
            pQueue.add(dataArrayList.get(i));//se añaden los elementos al queue
        }
        System.out.println("La lista priorizada es la siguiente:");
        while(!pQueue.isEmpty()){//mientras que el queue no este vacio, mostrat el primer elemento y eliminarlo
            System.out.println(pQueue.poll() + " ");
        }
        System.out.println("--------------------------------------------------");
        //se implementa el vectoHeap y la clase pacientes
        System.out.println("Implementacion con clase pacientes, comparable y Vector heap :)");
        pacientes p = new pacientes(dataArrayList);
        VectorHeap resultado = p.result();
        for(int i=0;i<resultado.size();i++){
            System.out.println(resultado.elementAt(i));
        }
    }
}			
