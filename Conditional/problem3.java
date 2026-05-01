// take input a lowercase character and print the uppercase version

import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a lowercase character:");
        char ch = sc.next().charAt(0);
        char upper= Character.toUpperCase(ch);
        System.out.println(upper);
    }
}
