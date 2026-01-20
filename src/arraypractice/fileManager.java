package arraypractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class fileManager {

	public static ArrayList<String> loadFromFile(ArrayList<String> names,String filename){

		try (BufferedReader br = new BufferedReader(new FileReader(filename))){
			String line;
			while ((line = br.readLine()) != null) {
				names.add(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}		
		return names;
	}


	public static void wrightToFile(ArrayList<String> names, String filename){

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))){
			for (String name : names){
				bw.write(name);
				bw.newLine();
			}
		} catch (IOException e){

			e.printStackTrace();

		}
	}


}
