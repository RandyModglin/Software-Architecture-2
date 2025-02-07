package IO;

import java.util.Comparator;
import java.util.HashMap;

abstract public class Output {
    
    Comparator<String> sortingMethod;
    public String[] filteredWords;

    public void Configure(String sortingStyle, String filtering, String words){
        if(sortingStyle.equals("Ascending")){
            sortingMethod = String.CASE_INSENSITIVE_ORDER;
        }
        else{
            sortingMethod = String.CASE_INSENSITIVE_ORDER.reversed();
        }

        if(filtering.equals("Yes")){
            filteredWords = words.split("\\,");
        }
    }

    public abstract void PrintProcess(HashMap<String, Integer>  processedLines);
}
