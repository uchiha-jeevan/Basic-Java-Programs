import java.util.*;

public class Factorial {
    
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println(" ");
        System.out.print("Enter number to find factorial : ");
        int num = input.nextInt();
        int res=1;
        for(int i=1;i<=num;i++){
            res=res*i;
        }
        System.out.println("Factorial of " + num + " is : "+ res);

    }
    


}
