
import  java.util.*;
public class no_vowels {
    void vowels(String s)
    {
        int[] arr= new int[26];
        Arrays.fill(arr,0);
        for (char c: s.toCharArray()){
           if((c-'a')>=0 && (c-'a')<26)
                arr[c-'a']++;
        }
        int sum= arr[0]+arr[4]+arr[8]+arr[14]+arr[20];
        System.out.println(sum);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s= scan.nextLine();
        no_vowels ob = new no_vowels();
        ob.vowels(s.toLowerCase());

        System.out.println("Changing the case: "+s.toLowerCase()+"\t"+s.toUpperCase());
    }
}
