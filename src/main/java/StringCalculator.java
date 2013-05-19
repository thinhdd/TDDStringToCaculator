/**
 * Created with IntelliJ IDEA.
 * User: RuaTre_IT
 * Date: 5/19/13
 * Time: 11:02 AM
 * To change this template use File | Settings | File Templates.
 */
public class StringCalculator {
    public int add(String... vargs) {
        String delimiter = null;
        String bufDelimiter = null;
        int sum=0;
        int len = vargs.length;
        if(len==0)
            return 0;
        for(int i=0;i<len; i++)
        {
            if(vargs[i].equals(""))
            {
                sum=sum+0;
                continue;
            }
            else if((vargs[i].length()>3))
            {
                if(vargs[i].substring(0,2).equals("//")){

                    String cur[] = vargs[i].split("\n");
                    bufDelimiter = cur[0].substring(2,cur[0].length());
                    sum = sum+sumCur(cur[1].split(bufDelimiter));
                }
                else
                    sum=sum+sumCur(vargs[i].split("[\n,]"));
            }
            else
                sum=sum+sumCur(vargs[i].split("[\n,]"));
        }
        return sum;
    }
    public int sumCur(String[] ar){
        int len = ar.length;
        int sum=0;
        int a;
        for(int i=0;i<len; i++){
            if(ar[i].equals(""))
            {
                sum=sum+0;
            }
            else{
                a= Integer.parseInt(ar[i]);
                if (a==-1)
                    throw new IllegalArgumentException("number is not negative");
                else
                if (a<1000)
                    sum=sum + Integer.parseInt(ar[i]);

            }

        }
        return sum;
    }
}
