import java.util.*;
public class array1 {
    public static void main(String[] args) {
        // int marks[]=new int[3];
        // marks[0]=1;
        // marks[1]=2;
        // marks[2]=3;

        // for(int i=0;i<3;i++){
        //     System.out.println(marks[i]);
        // }
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int numbers[]=new int [size];
//input
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();

        }

        int x=sc.nextInt();

        for(int i=0;i<numbers.length;i++){
            if (numbers[i]==x){
                System.out.println("x found at index number :"+i);

            }
           


        }

//output printing
        //int numbers[]=new int[size];
        // for(int i=0;i<size;i++){
        //     System.out.println(numbers[i]);

        // }
        
    }
}
