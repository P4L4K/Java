import java.util.*;
class Timeclass {
    int hrs;
    int min;
    int sec;
    public void setTime(int h, int m, int s){
        if (h<0 || h>24 || m<0 || m>59 || s<0 || s>59){
            System.out.println("Invalid time");
        }
        hrs=h;
        min=m;
        sec=s;
    }
    public void display(){
        System.out.println(hrs+":"+min+":"+sec);
    }
    public void addsec(int addsec){
          int total_sec= sec+(min*60)+(hrs*3600)+addsec;
          hrs = (total_sec/3600)%24;
          min= (total_sec % 3600)/60;
          sec=  ((total_sec % 3600)%60);
          
    }
}
public class Time{
    public static void main(String args[]){
        Timeclass obj= new Timeclass();
        obj.setTime(3,45,59);
        obj.display();
        obj.addsec(3660);
        obj.display();
    }
}
