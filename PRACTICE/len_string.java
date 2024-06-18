import java.util.*;
import java.text.*;
public class len_string {
    static int len(String s){
        int count=0;
        for (char i: s.toCharArray()){
            if (i==' ' )
                 continue;
            count++;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        String s= scan.nextLine();
        System.out.println("Length of string :" + len(s));
        System.out.println("using predefined fun :"+s.length());
    }
}
