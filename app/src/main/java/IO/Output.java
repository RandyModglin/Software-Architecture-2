package IO;

import java.util.ArrayList;
import java.util.TreeMap;

public interface Output {

    public abstract void PrintProcess(TreeMap<String, Integer> sortedProcess);

    public abstract void PrintIndex(TreeMap<String, ArrayList<Integer>> sortedIndex);
}
