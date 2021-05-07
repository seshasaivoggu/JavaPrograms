import java.util.*;
public class ATM {
    public static void main(String[] args) {
        int x;
	double y;
        Scanner ip=new Scanner(System.in);
        x=ip.nextInt();
        y=ip.nextDouble();
        if(x%5==0 && x<y)
            System.out.printf("%2d",y-x);
        else
            System.out.println(y);
    }
           
}
