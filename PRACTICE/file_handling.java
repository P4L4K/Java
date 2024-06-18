import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.nio.file.FileAlreadyExistsException;
public class file_handling {
    public static void main(String args[]){
        //create file
        File f= new File("my_first_file.txt");
        try{
            f.createNewFile();
            System.out.println("New file created!");
        }
        catch(FileAlreadyExistsException  e){
            System.out.println(e);
        }
        catch(IOException e){
            e.printStackTrace();
        }
        //reading
        String filepath="my_first_file.txt";
        try {
            BufferedReader reader= new BufferedReader( new FileReader(filepath));
            List<String> l = Files.readAllLines(Paths.get(filepath));
            String cont= String.join("\n",l);
            System.out.println(cont);
            String line= reader.readLine();
            while(line!=null){
                System.out.println(line);
                line=reader.readLine();
            }
        }
        catch(IOException e){
            System.out.println("ERROR OCCURED");
        }
    }
}
