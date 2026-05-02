// print the 10 multiples of n

import java.util.Scanner;

public class problem3 {
       public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    System.out.println("enter a number :");
    int n=sc.nextInt();
    for (int i=1;i<=10;i++){
        System.out.println(i*n);
    }
   } 
}
