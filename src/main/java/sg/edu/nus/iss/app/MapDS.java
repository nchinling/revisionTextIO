package sg.edu.nus.iss.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;



public class MapDS {
    private BufferedReader br;

    public MapDS() {}

    public MapDS(BufferedReader br) {this.br = br;}

    public BufferedReader getBr() {return br;}

    public void setBr(BufferedReader br) {this.br = br;}

    public Map<String,Integer> storemap(BufferedReader br){
        Map<String, Integer> wordFreq = new HashMap<>();
        String line;
        int numWords = 0;
        
        try {
            while ((line = br.readLine()) != null) {    //store line as strings as a string
                System.out.printf("> %s\n", line.toUpperCase());
                String[] words = line.split(" ");    // remove spaces in string and store in words. 
                numWords += words.length;
                // Iterate the all the words in the line
                for (String w: words) {
                    String t = w.trim().toLowerCase();
                    if (t.length() <= 0) {           //if no word, proceed back to for loop to find next word
                        continue;
                    }
                    if (!wordFreq.containsKey(t)) {
                        // If word is not in map, initialize the word with freq 1
                        wordFreq.put(t, 1);
                    } else {
                        // If word is in map, the increment the count
                        int c = wordFreq.get(t);
                        wordFreq.put(t, c + 1);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wordFreq;
    }

}
