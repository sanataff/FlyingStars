import java.util.Scanner;

public class CountDigit {
    
    public static int digitCount(double num){
        
        if(num <10){
            return 1;
        }
        else{
            return 1+ digitCount(num/10); 
        }
        
    }


    public static void main(String[] args) throws Exception {
        
    Scanner scnr = new Scanner(System.in);
      int num, digits;
      
      num = scnr.nextInt();
      digits = digitCount(num);
      System.out.println(digits);

    }

}
