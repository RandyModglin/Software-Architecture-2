package IO;

import java.util.Comparator;
import java.util.TreeMap;

abstract public class Output {
    
    Comparator<String> sortingMethod;
    public String[] filteredWords;

    public abstract void PrintProcess(TreeMap<String, Integer> sortedProcess);
}
