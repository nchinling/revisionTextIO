package sg.edu.nus.iss.app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;


public class FileProcess {
    
    private String filename;

    public FileProcess(){};

    public FileProcess(String filename){
        this.filename = filename;
    }

    public String getFilename() {return filename;}

    public void setFilename(String filename) {this.filename = filename;}

    public BufferedReader process(String filename) throws FileNotFoundException, IOException{
        Path p = Paths.get(filename);
        File f = p.toFile();


        // Open a file as input stream
        InputStream is = new FileInputStream(f);
        // Convert the input stream to a reader byte -> char (2 bytes)
        InputStreamReader isr = new InputStreamReader(is);
        // Read whole lines
        BufferedReader br = new BufferedReader(isr);
        // br.close();
        // isr.close();
        // is.close();
        return br;

    }

    
}
