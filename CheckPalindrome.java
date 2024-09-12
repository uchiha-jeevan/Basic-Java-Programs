
import java.util.*;

class CheckPalindrome{

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        System.out.println(" ");

        System.out.print("Enter Number to check Palindrome : ");
        int n = input.nextInt();
        int m=0;
        int t=n;
        while(t>0){
            int temp = t%10;
            m=m*10+temp;
            t=t/10;
        }
        System.out.println(" ");
        if(n==m){
            System.out.println("The given number is Palindrome ");
        }else{
            System.out.println("The given number is Not Palindrome ");
        }
        System.out.println(" ");


        // Below code is using string 
        System.out.println("--The below is checked using string--");
        System.out.println(" ");

        String s = Integer.toString(n);
        //System.out.println(s.length());
        Boolean d = true;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                d=false;
            }
        }
        if(d){
            System.out.println("The given number is Palindrome ");

        }else{
            System.out.println("The given number is not Palindrome ");
        }
        System.out.println(" ");
        
    }
}