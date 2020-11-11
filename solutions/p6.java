import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("problem: dividend/divisor");
        System.out.println("Enter dividend: ");
        Scanner scan=new Scanner(System.in);
        int n = scan.nextInt();//read user input
        System.out.println("Enter divisor: ");
        int d = scan.nextInt();
        divisionOpRem(n,d);

    }

    public static void divisionOpRem(int divid, int d){

        if(d==0){
            System.out.println("Cannot divide by 0");
            System.exit(0);
        }

        //reserve sign usage for result
        int sign=1;
        if(divid*d<0){
            sign=-1;
        }

        //make both positive
        divid=Math.abs(divid);
        d=Math.abs(d);

        int quotient=0;
        while(divid>=d){
            divid-=d;//remaining of div will be remainder
            quotient++;
        }
        System.out.println("("+(sign*quotient)+","+divid+")");
    }
}
