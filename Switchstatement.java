import java.util.*;

public class Switchstatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int btn = sc.nextInt();

        //  now using switch
        switch(btn){
            case 1 : System.out.println("Hello");
            break;
            case 2 : System.out.println("Namaste");
            break;
            case 3 :System.out.println("Bonjour");
            break;
            default : System.out.println("Invalid Button");
        } 
    }
}
