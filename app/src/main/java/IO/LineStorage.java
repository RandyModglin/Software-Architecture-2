package IO;

import java.util.ArrayList;

public class LineStorage {
    
    private ArrayList<String[]> storedLines;

    public LineStorage(){
        storedLines = new ArrayList<String[]>();
    }

    public void storeLines(Input inputObj) {
        storedLines = inputObj.readInput();
    }

    public ArrayList<String[]> getLines(){
        System.out.println(storedLines);
        
        return storedLines;
    }
    
}