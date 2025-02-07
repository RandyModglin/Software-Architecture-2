import IO.Input;
import IO.LineStorage;

public class Controller {	
	
	//3rd Arg is the function
	//4th arg for search in the keyword
	public static void main(String[] args) {
	
		if(args.length < 4 || args.length > 5){
			System.out.println("Incorrect Number of Arguments");
			return;
		}


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


			// Start process
			String processName = args[3];

			switch (processName) {
				case "kwic-processing":
					break;
				case "keyword-search":
					break;
				case "index-generation":
					break;
				default:
					System.out.println("Unsupported Process");
					return;
			}
		}

	}
}