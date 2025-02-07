package IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVInput extends Input {

    public CSVInput(){
        supportedType = ".CSV";
    }

    @Override
    public ArrayList<String[]> readInput(){
        ArrayList<String[]> readLines = new ArrayList<String[]>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(currFile))){
            String line;

            while ((line = br.readLine()) != null){
                String[] sepLine = line.split("\\.");

                readLines.add(sepLine);
            }
        }catch (FileNotFoundException e) {
			e.printStackTrace();
		}
        catch (IOException e) {
			e.printStackTrace();
		}

        return readLines;
    }
}
