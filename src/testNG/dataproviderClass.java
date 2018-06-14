package testNG;
import org.testng.annotations.DataProvider;
public class dataproviderClass {
@DataProvider(name="SearchProvider")
public static Object[][] credenticals()
{
	return new Object[][]
	{
		{"testuser_1", "Test@123"}, 
		{"testuser_1", "Test@123"}
	};
}
}
