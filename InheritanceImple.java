
import java.util.*;


class College{

    public void name(){
        System.out.println("College Name");
    }

    public String dept(){
        return "CSE\nECE\nEEE";
    }

    public int totalsttrength(){
        this.code();
        return 590;
    }

    private void code(){
        System.out.println("This is private");
    }

}


// a class can inherit from only one class
class CSE extends College{

    @Override // The below dept method is overriden by child , we can use name method from parent class
    public String dept(){
        System.out.println("This is CSE DEPT");
        return "";
    }


    @Override
    public int totalsttrength(){
        System.out.println("Total CSE strength - "+120);
        return 0;
    }

}


class ECE extends College{


    public String dept(){
        System.out.println("This is Ece dept");
        return "";
    }

    @Override
    public int totalsttrength(){
        System.out.println("Total ECE strength - "+90);
        return 0;
    }
}


class InheritanceImple{

    public static void main(String args[]){
        System.out.println("Ok");

        CSE cse = new CSE();

        cse.name();
        cse.dept();
        cse.totalsttrength();
        ECE ece = new ECE();

        ece.name();
        ece.dept();
        ece.totalsttrength();

        College college = new College();

        college.name();
        college.totalsttrength();
        //college.code();


    }
}