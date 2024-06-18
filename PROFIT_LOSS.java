//program to accept cost price and selling price from user and display profit and loss
import java.util.*;
public class PROFIT_LOSS {
    
    public void profit_loss()
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter cost price: ");
        int cp=scan.nextInt();
        System.out.println("Enter selling price: ");
        int sp=scan.nextInt();
        scan.close();
        if (sp>cp)
            System.out.println("PROFIT");
        if(sp<cp)
            System.out.println("LOSS");
        else
            System.out.println("NEITHEIR PROFIT NOR LOSS");

    }
    public static void main(String[] args)
    {
        PROFIT_LOSS ob= new PROFIT_LOSS();
        ob.profit_loss();
    }
}
