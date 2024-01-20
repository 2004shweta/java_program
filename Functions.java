import java.util.*;
public class Functions {
    // public static void  printMyName(String name){
    //     System.out.println(name);
    //     return; 
    // }
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     String name=sc.next(); 
    //     printMyName(name);//call funtction  
    // }

    //     public static int calculateSum(int a, int b){
    //         int sum=a+b;
    //         return sum;
    //     }
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int a=sc.nextInt();
    //     int b=sc.nextInt();
    //     int sum=calculateSum(a,b);
        
    //     System.out.print("sum of a and b:  "+sum);
         

        
    // }
    public static void printFactorial(int n){
        int fact=1;
        for(int i=n;i>=1;i--){
            fact=fact*i;
        }
        System.out.println(fact);

        return fact;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
    }
}

