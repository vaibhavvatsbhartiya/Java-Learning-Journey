import java.util.*;

public class GreaternumorLess {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        // now if else statement starts
        if(a==b){
            System.out.println("Both number are equal");
        } else if(a > b){
            System.out.println("a is greater number");
        } else{
            System.out.println("b is greater number");
        }

    }
}
