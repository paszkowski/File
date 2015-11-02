package asd;
import java.io.*;

public class FileCreator {

	public static void main(String[] args) {
		String filename = "PlikTekstowy";
		File file = new File(filename);
		Boolean fileExsist = file.exists();
		
		if(!fileExsist) {
			
				try {
					
					fileExsist = file.createNewFile();
					
				} catch(IOException e) {
					System.out.println("Nie udalo sie stworzyc pliku");
				}
			
		}
		
		if(fileExsist) {
			System.out.println("Plik" + filename + "istnieje, lub zostal utworzony");
		}

	}

}
