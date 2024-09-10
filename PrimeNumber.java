import java.util.*;

class PrimeNumber {

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number to check Prime or Not : ");
        int num = input.nextInt();
        String s = " is Prime";
        for(int i=2;i<num;i++){
            if(num%i==0){
                s=" is Not Prime";
            }
        }
        System.out.println("The given number  "+num +s);

    }
    
}
