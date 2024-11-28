import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Scanner;
import java.io.FileInputStream;


public class App {
    public static void main(String[] args) throws Exception {
        FileInputStream myfile = new FileInputStream("src/sources/integers_only.txt");
        Scanner scrn = new Scanner(myfile);
        while (scrn.hasNextLine()) {
            System.out.println("hello");
            scrn.nextLine();
            
        }
        
    }
            
    public static int[] reverse(int[] list){
        int[] newlist = new int[list.length];
        for (int i=0;i<list.length;i++)
          newlist[i] = list[list.length-1-i];
    
        
        list =newlist;
        return list;
    
    
     
}


    
        
    
     
     
                
        }
       
    
    
    

