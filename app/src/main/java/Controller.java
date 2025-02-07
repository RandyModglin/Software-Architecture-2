import IO.Input;
import IO.LineStorage;

public class Controller {	
	
	//3rd Arg is the function
	//4th arg for search in the keyword
	public static void main(String[] args) {
		System.out.println("Running KWIC System");
		
		//Get input object
		OptionReader.readOptions();
		String inputObjStr = OptionReader.getString("Input"); 
		
		Input inputObj = (Input) OptionReader.getObjectFromKey(inputObjStr);
		

		//Get input file
		String inputFileStr = OptionReader.getString("InputFileName");
		System.out.println(inputFileStr);
		
		if(inputObj.getInput(inputFileStr) == true){
			//Populate Line Storage
			LineStorage lineStorage = new LineStorage();
			lineStorage.storeLines(inputObj);

			lineStorage.getLines();
		}

	}
}