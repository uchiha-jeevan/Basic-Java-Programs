import java.util.* ;

// Interface_implementation.java;

interface Happy{
    public void mymethod();
    public int addition(int a , int b);
    public void multi(int a , int b);
}

interface Sad{
    public void sadmethod();
}

class Child implements Happy,Sad{

    public void sadmethod(){
        System.out.println("This is sad method");
    }
    public void mymethod(){
        System.out.println("");
        System.out.println("This method overridden by child class");
    }

    public int addition(int a,int b){
        return a+b;
    }
    public void multi(int a , int b){
        System.out.println("");
        System.out.println("The multiplication of a,b is : "+a*b);
    }

}

class Interface_implementation
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Child ch = new Child();
        System.out.println("");
        System.out.println("Enter value a and b for math operations");
        int a = sc.nextInt();
        sc.nextLine();
        int b=sc.nextInt();
        ch.mymethod();
        ch.multi(a, b);
        int c =ch.addition(a, b);
        System.out.println("");
        System.out.println("Addition of a , b is : "+c);
        System.out.println("");

    }
}