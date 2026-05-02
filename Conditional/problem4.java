// take input a uppercase character and print the lowercase version

import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a uppercase character:");
        char ch = sc.next().charAt(0);
        char lower= Character.toLowerCase(ch);
        System.out.println(lower);
    }
}
