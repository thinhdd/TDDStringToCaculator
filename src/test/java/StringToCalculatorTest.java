import junit.framework.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: RuaTre_IT
 * Date: 5/17/13
 * Time: 9:11 AM
 * To change this template use File | Settings | File Templates.
 */
public class StringToCalculatorTest {
    @Test
    public void test1() {
        StringCalculator st = new StringCalculator();
        Assert.assertEquals(5,st.add("2","3"));
    }
    @Test
    public void test2() {
        StringCalculator st = new StringCalculator();
        Assert.assertEquals(0,st.add(""));
    }
    @Test
    public void test3()  {
        StringCalculator st = new StringCalculator();
        Assert.assertEquals(0,st.add());
    }
    @Test
    public void test4() {
        StringCalculator st = new StringCalculator();
        Assert.assertEquals(6,st.add("1\n2,,3"));
    }
    @Test
    public void test5(){
        StringCalculator st = new StringCalculator();
        Assert.assertEquals(3,st.add("1\n,2"));
    }
    @Test (expected = IllegalArgumentException.class)
    public void test6(){
        StringCalculator st = new StringCalculator();
        try{
            Assert.assertEquals(1,st.add("-1\n-2,-3,1"));
        }
        catch (IllegalArgumentException e)
        {
            Assert.assertEquals("numbers is negative: -1 -2 -3 ",e.getMessage().toString());
            throw new IllegalArgumentException("");
        }
    }
    @Test
    public void test7(){
        StringCalculator st = new StringCalculator();
        Assert.assertEquals(3,st.add("//,\n1,2"));
    }
    @Test
    public void test8(){
        StringCalculator st = new StringCalculator();
        Assert.assertEquals(1,st.add("1\n,1001"));
    }
    @Test
    public void test9(){
        StringCalculator st = new StringCalculator();
        Assert.assertEquals(3,st.add("//[***]\n1***2"));
    }
    @Test
    public void test10(){
        StringCalculator st = new StringCalculator();
        Assert.assertEquals(6,st.add("//[;]\n1;2;3"));
    }
}

