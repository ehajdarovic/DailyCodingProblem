public class Main {
    public static void main(String[] args) {
        String[] user1 = {"/home", "/register", "/login", "/user", "/one", "/two"};
        String[] user2 = {"/home", "/red", "/login", "/user", "/one", "/pink"};
        longestContSeq(user1,user2);
    }

    public static void longestContSeq(String[] u1,String[] u2){

        int len;//length of current sequence
        int maxlen=0;//max length of sequence
        int start=0;

        for(int i=0;i<u1.length;i++){
            //reset
            len=0;
            maxlen=0;
            start=i;

            for(int j=0;j<u2.length;j++){
                if(u1[i]==u2[j]){
                    i++;
                    len++;
                }
                else{
                    if(len>maxlen)
                        maxlen=len;
                }
            }
        }

        //output
        System.out.print("{ ");
        for(int p=0;p<maxlen;p++){
            System.out.print(u1[start]);
            if(p!=maxlen-1)
                System.out.print(", ");
            start++;//iterate
        }
        System.out.print(" }");
    }
}
