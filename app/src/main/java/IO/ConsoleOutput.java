package IO;

import java.util.TreeMap;

public class ConsoleOutput extends Output {

    @Override
    public void PrintProcess(TreeMap<String, Integer> sortedProcess) {
        System.out.print("Index ");
        System.out.print(" Circular Shifted Line "); 
        System.out.println(" Original Line Index");

        int index = 1;
        for(java.util.Map.Entry<String, Integer> entry : sortedProcess.entrySet()) {
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
