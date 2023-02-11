package sg.edu.nus.iss.app;


import java.io.BufferedReader;
import java.io.Console;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;





public class App 
{
    // entry point
    public static void main(String[] args) throws IOException {

        System.out.printf("args.length: %d\n", args.length);
        for (String a: args) {
            System.out.printf(">>> %s\n", a);
        }

        // Get a reference to the file
    //    FileCopier file = new FileCopier();
        // TextStats file = new TextStats();

        FileProcess file = new FileProcess();
        BufferedReader br = file.process(args[0]);

        //ListDS
        ListDS namelist = new ListDS();
        List<String> dsnamelist = namelist.storelist(br);
        List<String> addname = namelist.addToList(dsnamelist);
        List<String> sortedWordList = namelist.listWordSort(addname);
        PrintList printer = new PrintList();
        printer.print2file(sortedWordList,args[0]);



        // MapDS wordmap = new MapDS();
        // Map<String,Integer> wm = wordmap.storemap(br);
        
        // PrintMap printer = new PrintMap();
        // printer.printconsole(wm);
        // printer.print2file(wm, args[0]);

    
    }
}
