/* Universidad del Valle de Guatemala
Maria Isabel Montoya 19169
Hoja de Trabajo No. 8
main*/
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList; 
import java.util.*; 
import java.util.Collection;
public class main{
    public static void main(String[]args){
	ArrayList<String> dataArrayList = new ArrayList<String>();
	Scanner s = null;
	String archive = "pacientes.txt";
	File fichero = new File(archive);
	String linea="";
	try{
            s = new Scanner(fichero);
            while(s.hasNextLine()){
                linea = s.nextLine();
                String data[] = linea.split(",");
                String infoPatient = data[2]+","+ data[1]+","+data[0];
                dataArrayList.add(infoPatient);
            }
	}
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
        System.out.println("Implementacion con JCF PriorityQueue:");
        PriorityQueue<String> pQueue = new PriorityQueue<String>();
        System.out.println(dataArrayList.size());
        for(int i=0;i<dataArrayList.size();i++){
            System.out.println(dataArrayList.get(i));
            pQueue.add(dataArrayList.get(i));
            i++;
        }
        System.out.println("La lista priorizada es la siguiente:");
        System.out.println(pQueue);
    }
}			
