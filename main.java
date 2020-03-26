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
		ArrayList<String> dataArrayList = new ArrayList<String>;
		Scanner s = null;
		String archive = "pacientes.txt";
		File fichero = new Fichero(archive);
		String linea="";
		try{
			s = Scanner(fichero);
			while(s.hasNextLine()){
				linea = s.nextLine();
				Sring[] data = linea.split(",");
				dataArrayList.add(data[0],data[1],data[2]);
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
	}
}			