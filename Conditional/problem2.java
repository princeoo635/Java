// Take input 5 subjects marks and print the overall percentage of students

import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter subject1 marks :");
        int subject1=sc.nextInt();
        System.out.println("Enter subject2 marks :");
        int subject2=sc.nextInt();
        System.out.println("Enter subject3 marks :");
        int subject3=sc.nextInt();
        System.out.println("Enter subject4 marks :");
        int subject4=sc.nextInt();
        System.out.println("Enter subject5 marks :");
        int subject5=sc.nextInt();
        int totalMarks = subject1+subject2+subject3+subject4+subject5;
        System.out.println(totalMarks);
        double percentage = (totalMarks*100)/500;
        System.out.println("percentage : "+ percentage);
    }
}
