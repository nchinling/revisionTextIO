package sg.edu.nus.iss.app;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCopier {

    private String filename;

    public FileCopier(){}


    public FileCopier(String filename) {
        this.filename = filename;
    }

    public String getFilename() {return filename;}


    public void setFilename(String filename) {this.filename = filename;}

    
    public void process(String filename) throws FileNotFoundException, IOException{
        Path p = Paths.get(filename);

        // Get the actual file object
        File f = p.toFile();

        // Open the file for reading and writing
        InputStream is = new FileInputStream(f);
        OutputStream os = new FileOutputStream("Copy of %s".formatted(filename));
        byte[] buffer = new byte[1024]; // 1K buffer
        int size = 0;

        //while 
        while ((size = is.read(buffer)) > 0) {
            System.out.printf("%d\n",size);
            os.write(buffer, 0, size);
        }


        os.flush();
        os.close();

        is.close();
        }

}

