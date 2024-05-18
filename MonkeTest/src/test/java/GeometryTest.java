import org.example.Geometry;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GeometryTest {
    Geometry geometry = new Geometry();

    @Test(groups = {"smoke-test", "positive-test"})
    public void testCalculateSquareArea() {
        double result = geometry.calculateSquareArea(5);
        Assert.assertEquals(result, 25.0);
    }

    @Test(groups = {"smoke-test", "positive-test"})
    public void testCalculateRectangleArea() {
        double result = geometry.calculateRectangleArea(4, 6);
        Assert.assertEquals(result, 25.0);
    }

    @Test(groups = {"positive-test"})
    public void testCalculateCircleArea() {
        double result = geometry.calculateCircleArea(3);
        Assert.assertEquals(result, 28.274333882308138);
    }

    @Test(groups = {"negative-test"}, expectedExceptions = IllegalArgumentException.class)
    public void testCalculateSquareAreaNegative() {
        geometry.calculateSquareArea(-5);
    }

    @Test(groups = {"negative-test"}, expectedExceptions = IllegalArgumentException.class)
    public void testCalculateRectangleAreaNegative() {
        geometry.calculateRectangleArea(4, -6);
    }

    @Test(groups = {"negative-test"}, expectedExceptions = IllegalArgumentException.class)
    public void testCalculateCircleAreaNegative() {
        geometry.calculateCircleArea(-3);
    }
}
