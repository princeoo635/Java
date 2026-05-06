import java.util.Scanner;

//  print the sum of all the numbers from 1 to n
public class problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int n= sc.nextInt(); 
        int sum=0;
        for(int i=1;i<=n;i++){
            sum = sum + i;
        }
        System.out.println("Sum="+sum);
    }
}
