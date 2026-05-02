// Take input 5 subject marks drop the least one and calculate the overall percentage considering only the top 4 marks print it.

import java.util.Scanner;

public class problem5 {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in); 
     int marks[] = new int[5];
     int totalscore=0;
      for(int i=0;i<5;i++){
        System.out.println("enter marks for subject" ); 
        marks[i]=sc.nextInt();
      } 
      int min=marks[0];
      for(int i=0;i<5;i++){
        totalscore +=marks[i];
        if(min>marks[i]){
          min=marks[i];
        }
      } 
      int bestof4score=totalscore-min;
      double percentage= (bestof4score*100)/400;
      System.out.println("percentage:"+percentage);
  }  
}
