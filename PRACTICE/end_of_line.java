/*
 Hackerrank:
        https://www.hackerrank.com/challenges/java-end-of-file/problem?isFullScreen=false
 */
import java.util.*;
public class end_of_line {

    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        int i=0;
        while(scan.hasNext())
        {
            String s=scan.nextLine();
            i+=1;
            System.out.println(i+" "+s);
        }
        scan.close();
        //ctrl + z followed by enter : EOL 
    }
}