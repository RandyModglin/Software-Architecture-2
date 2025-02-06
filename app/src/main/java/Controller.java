import java.util.*;

import IO.Input;
import IO.LineStorage;

public class Controller {	
	
	//3rd Arg is the function
	//4th arg for search in the keyword
	public static void main(String[] args) {
		
		//Get input object
		OptionReader.readOptions();
		String inputObjStr = OptionReader.getString("Input"); 
		
		Input inputObj = (Input) OptionReader.getObjectFromKey(inputObjStr);
		
		//Populate Line Storage
		LineStorage lineStorage = new LineStorage();
		lineStorage.storeLines(inputObj);

		String processName = args[3];
		switch(processName){

		}
	}
}