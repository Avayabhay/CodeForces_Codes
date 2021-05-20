import java.util.Scanner;

public class PotionMaking{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int k =sc.nextInt();
            System.out.println(100/gcd(k,100-k));
        }

        sc.close();
    }

    static int gcd(int a, int b){
        // int ans =0;
        if(a ==0){
            return b;
        }
        else if(b ==0){
            return a;
        }
        else if(a == 1 || b ==1){
            return 1;
        }
        else if(a == b){
            return a;
        }
        else if(a>b){
            return gcd(a-b,b);
        }
        return gcd(a,b-a);

        // return ans;
    }
}