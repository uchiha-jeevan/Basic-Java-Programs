
import java.util.*;

// program to return prime numbers in between two inputs

class PrimeNumberList {

    public static void main(String args[]){
        System.out.println("");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Start Number : ");
        int start = input.nextInt();
        input.nextLine();
        System.out.print("Enter End number : ");
        int end = input.nextInt();
        ArrayList<Integer> prime = new ArrayList<>();
        for(int i=start;i<=end;i++){
            Boolean s = true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    s =false;
                }
            }
            if(s){
                prime.add(i);
            }
        }
        System.out.println("");
        System.out.println("Total No of prime numbers between start and end "+prime.size());
        System.out.println("");
        
        System.out.println("Below are the prime numbers");
        System.out.println("");

        System.out.println(prime);
        System.out.println("");

    }
    
}
