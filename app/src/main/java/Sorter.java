import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class Sorter {

    public static Comparator<String> sortingMethod;
    public static Boolean isFiltering;
    public static String[] filteredWords;

    public static void Configure(){        
        if(OptionReader.getString("Order").equals("Ascending")){
            sortingMethod = String.CASE_INSENSITIVE_ORDER;
        }
        else{
            sortingMethod = String.CASE_INSENSITIVE_ORDER.reversed();
        }

        if(OptionReader.getString("WordFiltering").equals("Yes")){
            isFiltering = true;
            filteredWords = OptionReader.getString("TrivialWords").split("\\,");
        }
    }

    public static TreeMap<String, Integer> sortProcess(HashMap<String, Integer> processedLines) {
        TreeMap<String, Integer> sortedMap = new TreeMap<String, Integer>(sortingMethod);
        sortedMap.putAll(processedLines);

        return sortedMap;
    }

    
}
