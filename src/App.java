import java.util.Scanner;


public class App {
    

    public static int fibonacci(int start){
        int sum = start;
        if(start == 0 || start ==1){
            return start;
        }
        else{
            return fibonacci(start-1)+fibonacci(start-2);
        }
       
      
        
       

    } 
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner scnr = new Scanner(System.in);
        int startNum = scnr.nextInt();
        System.out.println(fibonacci(startNum));

    }

}
