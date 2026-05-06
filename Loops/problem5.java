// print all prime numbers from 1 to 100
 
public class problem5 {
    public static void main(String[] args) {
   
    System.out.println("Prime number :"); 
    for (int i=2;i<=100;i++){
        int fact=0;
        for(int j=2;j<=i;j++){
           if(i%j==0){
            fact++;
           }
        
        }
        if(fact==1){
            System.out.println(i);
        }
    }
   } 
}
