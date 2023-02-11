package sg.edu.nus.iss.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.*;


public class WordSort {
    private BufferedReader br;

    public WordSort(){}

    public WordSort(BufferedReader br) {this.br = br;}

    public BufferedReader getBr() {return br;}

    public void setBr(BufferedReader br) {this.br = br;}

    @Override
    public String toString() {
        return "WordSort [br=" + br + "]";
    }

    public void sortconsole(BufferedReader br){
        List<String> al = new ArrayList<String>();

        String line;

        int numWords = 0;
        
        try {
            while ((line = br.readLine()) != null) {    //store line as strings as a string
                String[] words = line.split(" ");
                for (String w: words) {
                    String t = w.trim().toLowerCase();
                    if (t.length() <= 0) {           //if no word, proceed back to for loop to find next word
                        continue;
                    }
                    al.add(t);
                }
                
                   
            }
        } catch (IOException e){
            e.printStackTrace();
        } 

        //print sorted list
        Collections.sort(al);
        al.forEach(t -> System.out.println(t));
       
    }



    

    

    


}
