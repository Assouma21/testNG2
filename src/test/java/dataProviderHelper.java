import org.testng.annotations.DataProvider;

public class dataProviderHelper {
    @DataProvider(name= "provider1")
    public Object[][] dataProvider(){
        Object[][] newdata = new Object[3][3];
        newdata[0][0]= 123;
        newdata[0][1]= "Shuvashish";
        newdata[0][2]= 1234567890;
        newdata[1][0]= 1223;
        newdata[1][1]= "halim";
        newdata[1][2]= 3479623;
        newdata[2][0]= 1523;
        newdata[2][1]= "Aziz";
        newdata[2][2]= 1236523;

        return newdata;

    }

}
