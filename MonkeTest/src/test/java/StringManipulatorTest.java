import org.example.StringManipulator;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class StringManipulatorTest {
    StringManipulator stringManipulator = new StringManipulator();

    @DataProvider(name = "concatenateData")
    public Object[][] provideConcatenateData() {
        return new Object[][]{
                {"Hello", "World", "HelloWorld"},
                {"Test", "NG", "TestNG"},
                {"Java", "Programming", "JavaProgramming"}
        };
    }

    @Test(dataProvider = "concatenateData", groups = {"smoke-test", "critical_path-test", "extended-test", "positive-test"})
    public void testConcatenateWithDataProvider(String str1, String str2, String expected) {
        String result = stringManipulator.concatenate(str1, str2);
        Assert.assertEquals(result, expected);
    }

    @Test(groups = {"smoke-test", "critical_path-test", "extended-test", "positive-test"})
    public void testFindLength() {
        int result = stringManipulator.findLength("Hello");
        Assert.assertEquals(result, 5);
    }

    @Test(groups = {"critical_path-test", "extended-test", "positive-test"})
    public void testConvertToUpperCase() {
        String result = stringManipulator.convertToUpperCase("hello");
        Assert.assertEquals(result, "HELLO");
    }

    @Test(groups = {"critical_path-test", "extended-test", "positive-test"})
    public void testConvertToLowerCase() {
        String result = stringManipulator.convertToLowerCase("HELLO");
        Assert.assertEquals(result, "hello");
    }

    @Test(groups = {"extended-test", "negative-test"}, expectedExceptions = IllegalArgumentException.class)
    public void testConcatenateWithNull() {
        stringManipulator.concatenate("Hello", null);
    }

    @Test(groups = {"extended-test", "negative-test"}, expectedExceptions = IllegalArgumentException.class)
    public void testFindLengthWithNull() {
        stringManipulator.findLength(null);
    }

    @Test(groups = {"extended-test", "negative-test"}, expectedExceptions = IllegalArgumentException.class)
    public void testConvertToUpperCaseWithNull() {
        stringManipulator.convertToUpperCase(null);
    }

    @Test(groups = {"extended-test", "negative-test"}, expectedExceptions = IllegalArgumentException.class)
    public void testConvertToLowerCaseWithNull() {
        stringManipulator.convertToLowerCase(null);
    }
}