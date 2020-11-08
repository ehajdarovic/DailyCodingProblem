import java.util.*;
public class Main {

    public static void main(String[] args) {
        
        int a[]={-1, 5, 13, 8, 2, 3, 3, 1};
        int k=3;//window size 3
        medianWindow(a,k);
    }


    public static void medianWindow(int[] a, int k){

        for(int i=0;i<a.length && i<=a.length-k;i++){

            int med;
            int index=k/2;//index of median
            int[] m=new int[k];//set window in new array

            int c=0;//count for window size k
            for(int j=i;j<a.length && c<k;j++){
                m[c]=a[j];
                c++;
            }

            c=0;//reset count
            Arrays.sort(m);
            med=m[index];//get median

            System.out.println(" ");
            System.out.print(med +" <- median of [");

            //output the window array
            for(int p=i;p<a.length && c<k;p++) {
                c++;
                if (c != k)
                    System.out.print(a[p] + ", ");
                else
                    System.out.print(a[p] + "]");
            }
        }
    }
}
