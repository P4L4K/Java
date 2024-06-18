import java.util.*;

public class week {
    int week_day(int n)
    {
       if (n>7 || n<1)
           return 0;
       String[] week_days={
    "Monday",
    "Tuesday",
    "Wednesday",
    "Thursday",
    "Friday",
    "Saturday",
    "Sunday"  };
       System.out.println(week_days[n-1]);
       return 1;
    }
    public static void main(String[] args)
    {
        week ob= new week();
        Scanner scan = new Scanner(System.in);
        ob.week_day(scan.nextInt());
        
    }
}
