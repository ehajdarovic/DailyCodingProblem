import java.util.Scanner;

public class Main {

    public static <string> void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.print("Enter your numerical birth month (1-12): ");
        int month=scan.nextInt();

        System.out.print("Enter your numerical day of birth (1-30 or 1-31 or 1-28): ");
        int day=scan.nextInt();


        String zodiac="";//initialize result

        String[] months={"","January","February","March","April","May","June","July","August","September","October","November","December"};//12
        String[] zodiacs={"","Aquarius", "Pisces","Aries", "Taurus", "Gemini", "Cancer", "Leo", "Virgo","Libra","Scorpio", "Sagittarius", "Capricorn"};//12
        int[] days={0,20,18,19,20,21,19,20,20,21,20,21,22,23,22,23,22,23,22,23,21,22,21,22,19};//intervals of zodiac signs
        int[] lastDays={31,28,31,30,31,30,31,31,30,31,30,31};//length of each month
        //an interval for each month will start will lowest cutoff

        //check validity
        if(month<1 || month>12) {
            System.out.println("Entered an invalid month");
            System.exit(-1);
        }

        if(day>lastDays[month-1]) {
            System.out.println("Entered an invalid day for birth month");
            System.exit(-1);
        }

        //get interval to match
        int interval=(2*month)-2;//earliest interval date within birth month

        if((month-1)==0) {
            interval = days.length - 1;
            month = zodiacs.length;
        }
        if(day<=days[interval])
            zodiac=zodiacs[month-1];


        if((interval+1)==days.length) {
            interval = 0;
            month = 1;
        }
        if(day>=days[interval+1])
            zodiac=zodiacs[month];

        System.out.println("Your birthday is on "+months[month]+" "+day+"!");
        System.out.println("Your zodiac sign is "+zodiac+"!");

    }
}
