import java.util.*;
class DecimalToBinary{    
public static void main(String[] args){    
Scanner ip=new Scanner(System.in);
int decimal=ip.nextInt();     
int binary[] = new int[40];    
     int index = 0;    
     while(decimal>0)
     {    
       binary[index++] = decimal%2;    
       decimal = decimal/2;    
     }    
     for(int i = index-1;i >= 0;i--){    
       System.out.print(binary[i]);    
     }    
}
}    
