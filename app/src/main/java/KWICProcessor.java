
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;

import IO.LineStorage;

public class KWICProcessor {
    
    public HashMap<String, Integer> ProcessFile(LineStorage lineStorage)  {
        HashMap<String, Integer> processedLines = new HashMap<>();
        
        int currIndex = 1;

        ArrayList<String[]> storedLines = lineStorage.getLines();

        for(String[] line : storedLines){
            for(String word : line){
                Collections.rotate(Arrays.asList(line), 1);
                String joinLine = String.join(" ", line);
                processedLines.put(joinLine, currIndex);
            }
        }

        return processedLines;
    }

    public void PrintProcess(HashMap<String, Integer> processedLines){
        System.out.println();

        TreeMap<String, Integer> sortedMap = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        sortedMap.putAll(processedLines);

        System.out.print("Index ");
        System.out.print(" Circular Shifted Line ");
        System.out.println(" Original Line Index");

        int index = 1;
        for(java.util.Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            String line = entry.getKey();
            Integer originIndex = entry.getValue();

            System.out.print(index + ": ");
            System.out.print(line + "       ");
            System.out.println(originIndex);

            index++;
        }

        System.out.println();
    }
    
}