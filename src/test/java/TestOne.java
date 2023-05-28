import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestOne {

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");
    }
    @Test(priority = 2)
    public void test1(){
        System.out.println("test 1");
    }
    @Test(priority = 0)
    public void test9(){
        System.out.println("test9");
    }

    @Test
    public void test5(){
        System.out.println("test5");
    }
   // @Test(dataProvider = "provider1",dataProviderClass = dataProviderHelper.class)
    //public void test2(int ssn , String name , int ph){
      //  System.out.println("SSN is" + ssn);
        //System.out.println("Name is" + name);
        //System.out.println("phone number is " + ph);

    //}
    //@Test(dataProvider = "provider")
    //public void test3(int ssn , String name ){
        //System.out.println("SSN is" + ssn);
      //  System.out.println("Name is" + name);
   // }
    @DataProvider(name = "provider")
    public Object[][] dataProvider(){
        Object[][] data = new Object[2][2];
        data[0][0] = 123;
        data[0][1] = "kasif";
        data[1][0] = 236;
        data[1][1] = "Asma";

        return data;
    }




}
