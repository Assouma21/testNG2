import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestOne {

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");
    }
    @Test
    public void test1(){
        System.out.println("test 1");
    }
    @Test
    public void test2(){
        System.out.println("test 2");
    }
}
