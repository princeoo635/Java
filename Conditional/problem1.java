// take age input and print if he/she is eligible to vote or not

import java.util.Scanner;

public class problem1 {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter age :");
    int age = sc.nextInt();
    if(age<18){
        System.out.println("Not eligible to vote");
    }
    else{
        System.out.println("eligible to vote");
    }
}
    
}