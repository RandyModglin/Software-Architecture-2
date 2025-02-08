package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TxtOutput implements Output{

     @Override
    public void PrintProcess(TreeMap<String, Integer> sortedProcess) {

        PrintStream out;
        try {
            out = new PrintStream(new FileOutputStream("output.txt"));
            System.setOut(out);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

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
    }

    @Override
    public void PrintIndex(TreeMap<String, ArrayList<Integer>> sortedIndex) {
        PrintStream out;
        try {
            out = new PrintStream(new FileOutputStream("output.txt"));
            System.setOut(out);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for(Entry<String, ArrayList<Integer>> entry : sortedIndex.entrySet()) {
            String key = entry.getKey();
            ArrayList<Integer> indexes = entry.getValue();

            System.out.print(key);
            for(int index: indexes){
                System.out.print(", " + index);
            }

            System.out.println();
        }
    }
    
}
