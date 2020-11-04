public class Main {

    public static void main(String[] args) {

        int a[]={5, 2, 99, 3, 4, 1, 100};
        System.out.print("[ ");
        for(int i=0;i< a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("]");
        System.out.println("Below is maximum length of a sequence of consecutive numbers: ");
        maxConsecutive(a);
    }

    public static void maxConsecutive(int[] a){

        int max=0;//find max element in array
        for(int i=0;i< a.length;i++){
            if(a[i]>max)
                max=a[i];
        }

        int counts[]=new int[max+1];//keeps count of all array elements

        for(int i=0;i< a.length;i++) counts[a[i]] += 1;//store counts of each element


        int max_length=0;//find max consecutive length
        int length=0;//length of the maximum length of a sequence of consecutive numbers
        int start=0;//index+value of 1st element

        for(int i=0; i < counts.length;i++){//look for max length of consecutive counts>0

            if(counts[i]>0)
                length++;
            else
                length=0;

            if(length>max_length) {
                max_length = length;
                start = (i - max_length) + 1;
            }
        }

        //print consecutive #s
        System.out.print("[ ");
        for(int i=start;i<=max_length;i++)
            System.out.print(i+" ");
        System.out.println("]");
    }
}
