//https://www.codechef.com/FEB21A/problems/MEET
import java.util.*;
import java.io.*;
public class Chef_and_meetings {

    public static int calculateminuts(String t, String meridian) {
        String[] s = t.split(":");
        int h=Integer.parseInt(s[0]);
        int m=Integer.parseInt(s[1]);
        if(meridian.equals("AM")){
            if(h==12) return 60*h+m-720;
            return 60*h+m;
        }else{
            if(h==12) return 60*h+m;
            return 60*h+m+720;
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            StringBuffer sb = new StringBuffer("");
            String[] p = br.readLine().split(" ");
            int ptime=calculateminuts(p[0],p[1]);
            int n = Integer.parseInt(br.readLine());
            for (int i = 0; i < n; i++) {
                p=br.readLine().split(" ");
                int l=calculateminuts(p[0],p[1]);
                int r=calculateminuts(p[2],p[3]);
                if(l<=ptime && ptime<=r)sb.append("1");
                else sb.append("0");
            }
            System.out.println(sb);
        }
    }

}
