
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class IfStatementsTest {

    static IfStatements is;

    @BeforeClass
    public static void setUp() {
        is = new IfStatements();
    }

    
    /**
     * Tests the ifExample() method of the IfStatements class.
     * 
     * This test verifies that, if ifExample() receives a boolean value of `true`, it returns the value of the `x` parameter, which is 0.
     */
    @Test
    public void ifExampleTest1(){
        boolean bool = true;
        int x = 0;
        int y = 1;
        int expected = 0;
        int actual = is.ifExample(bool, x, y);
        Assert.assertEquals(expected, actual);
    }

    /**
     * Tests the ifExample() method of the IfStatements class.
     * 
     * This test verifies that, if ifExample() receives a boolean value of `false`, it returns the value of the `y` parameter, which is 1.
     */
    @Test
    public void ifExampleTest2(){
        boolean bool = false;
        int x = 0;
        int y = 1;
        int expected = 1;
        int actual = is.ifExample(bool, x, y);
        Assert.assertEquals(expected, actual);
    }
}
