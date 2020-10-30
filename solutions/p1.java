import java.util.*;

public class Main {

    public static void main(String[] args)
    {

        int nums[]={1,-2,-3};
        int result=minStart(nums);
        System.out.println(result);

    }


    public static int minStart(int nums[]) {

        //start point
        int start = 1;
        //initiate sum
        int sum = 0;

        //add start val

        while(sum<1)
        {
            sum = start + nums[0];

            for (int i = 1; i < nums.length; i++)
            {
                if(sum>=1)
                {
                    sum += nums[i];
                }

                if (sum<1)
                {
                    start++;
                    break;
                }
            }

        }

        return start;
    }

}
