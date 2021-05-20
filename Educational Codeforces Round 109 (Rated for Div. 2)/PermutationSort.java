import java.util.Scanner;
public class PermutationSort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            boolean sorted = true;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if( arr[i] != i+1){
                    sorted = false;
                }

            }
            

            if (arr[0] == 1 || arr[n-1] == n) {
                if(sorted){
                    System.out.println(0);
                }
                else{
                    System.out.println(1);
                }
            } 
            else if(arr[0] == n && arr[n-1] == 1) {
                    System.out.println(3);     
            }
            else{
                System.out.println(2);
            }
        }
        // sc.close();

    }

}
