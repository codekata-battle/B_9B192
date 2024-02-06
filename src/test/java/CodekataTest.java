import org.junit.Assert;
import org.junit.Test;

public class CodekataTest {
    /**
     * Here write tests of functions in CodekataProblem
     * */

    @Test
    public void test1(){
        Assert.assertEquals(CodekataProblem.x5(10), 50);
    }

    @Test
    public void test2(){
        Assert.assertEquals(CodekataProblem.ixj(10, 9), 90);
    }

    @Test
    public void test3(){
        Assert.assertEquals(CodekataProblem.iminus100(101), 1);
    }
}
