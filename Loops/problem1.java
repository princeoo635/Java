// print counting from 1 to n

import java.util.Scanner;

public class problem1 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    System.out.println("enter a number :");
    int n=sc.nextInt();
    for (int i=1;i<=n;i++){
        System.out.println(i);
    }
   } 
}
