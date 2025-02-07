package IO;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class ConsoleOutput extends Output {

    @Override
    public void PrintProcess(HashMap<String, Integer> processedLines) {
        System.out.println();

        TreeMap<String, Integer> sortedMap = new TreeMap<String, Integer>(sortingMethod);
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
