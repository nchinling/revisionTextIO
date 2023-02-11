package sg.edu.nus.iss.app;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Set;



public class PrintMap {
    private Map<String, Integer> wordFreq;

    public PrintMap() {}
    public PrintMap(Map<String, Integer> wordFreq) {this.wordFreq = wordFreq;}

    public void printconsole(Map<String, Integer>wordFreq){
        Set<String> words = wordFreq.keySet();   //store the set of keys in a set
        int count = 0;
        for (String w: words) {;
            count += 1;
            System.out.printf("%d: %s\n", count,w);
        }
    }

    public void print2file(Map<String, Integer>wordFreq, String filename){
        File file = new File("Copy of " + filename);
  
        BufferedWriter bf = null;
  
        try {
  
            // create new BufferedWriter for the output file
            bf = new BufferedWriter(new FileWriter(file));
  
            // iterate map entries
            Set<String> words = wordFreq.keySet();   //store the set of keys in a set
            int count = 0;
            for (String w: words) {
  
                // put key and value separated by a colon
                bf.write(w);
                // new line
                bf.newLine();
            }
              
            bf.flush();
            }catch (IOException e) {
                        e.printStackTrace();
                    }
                    finally {
              
                        try {
              
                            // always close the writer
                            bf.close();
                        }
                        catch (Exception e) {
                        }
            }
    }

}