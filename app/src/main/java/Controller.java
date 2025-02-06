import java.util.*;

public class Controller {	
	
	public static void main(String[] args) {
		
		//Get input object
		
		OptionReader.readOptions();
		String inputObjStr = OptionReader.getString("Input"); 
		
		Input inputObj = (Input) OptionReader.getObjectFromKey(inputObjStr); 	

        System.out.println("Successful Run");
	}
}