package testing;

import Triangle.CreateTriangle;
import org.junit.Assert;
import org.junit.Test;

public class CreateTriangleTest {

    /*1. build right triangle*/
    @Test
    public void buildRightTriangle() {
        Assert.assertTrue(CreateTriangle.getTriangle(3, 4, 5));
    }
    /*2. build isosceles triangle*/
    @Test
    public void buildIsoscelesTriangle() {
        Assert.assertTrue(CreateTriangle.getTriangle(2, 2, 1));
    }
    /*3. build equilateral triangle*/
    @Test
    public void buildEquilateralTriangle() {
        Assert.assertTrue(CreateTriangle.getTriangle(1, 1, 1));
}}
