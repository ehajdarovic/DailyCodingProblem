public class Main {

    public static void main(String[] args) {
        int a[]={-5, -3, 2, 3};
        int result=lowIndexAndNum(a);
        System.out.println(result);

    }

    public static int lowIndexAndNum(int[] a) {
        int minIndex=0;

        for(int i=0;i<a.length;i++) {
            if(a[i]==i) {
                minIndex=i;
                break;
            }
        }
        return minIndex;
    }
}
