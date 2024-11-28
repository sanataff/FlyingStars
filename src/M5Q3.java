
public class Main {
    public static void main(String[] args) {
        int[] list3 = {1,2,3,4,5,6};
        reverse(list3);
        for(int i=0;i<list3.length;i++){
            System.out.println(list3[i]);
        }
        
       }

    

 
 
            
    }
    public static int[] reverse(int[] list){
        int[] newlist = new int[list.length];
        for (int i=0;i<list.length;i++)
          newlist[i] = list[list.length-1-i];
    
        
        list =newlist;
        return list;
    
    
     
}

