import java.util.*;
public class TwoDarray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
         int [][]numbers=new int[rows][cols];
//inpput
         for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                numbers[i][j]=sc.nextInt();
            }
         }

         for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println(numbers[i][j]+" ");
            }
            System.out.println();
         }

         int x=sc.nextInt();
         for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(numbers[i][j]==x){
                    System.err.println("x found at index ("+ i + ", "+j + ")");
                }
            }
         }
    }
   

   
    //outppput  
}
