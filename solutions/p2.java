import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        System.out.print("Enter number for length: ");
        Scanner scan=new Scanner(System.in); //scanner for input
        int input=scan.nextInt(); //input
        double length=getLength(input);
        System.out.println(length);//print length found

    }

    public static double getLength(int i)//work w/ double so rounding can happen
    {
        if(i==0)
            return 1;
        else
            return Math.floor(Math.log10(i))+1; //ex. log10(10)=1+1=2 
    }
}
