package testing;

import Triangle.CreateTriangle;
import org.junit.Assert;
import org.junit.Test;

public class CreateTriangleTest {

    /*1*/
    @Test
    public void buildPythagoreanTriangle() {
        Assert.assertTrue(CreateTriangle.getTriangle(3, 4, 5));
    }
    /*2*/
    @Test
    public void buildIsoscelesTriangle() {
        Assert.assertTrue(CreateTriangle.getTriangle(2, 2, 1));
    }
    /*3*/
    @Test
    public void buildEquilateralTriangle() {
        Assert.assertTrue(CreateTriangle.getTriangle(1, 1, 1));
    }
    /*4*/
    @Test
    public void IsFalseWhenTheSumOfTwoEqualSidesIsLessThanTheThird() {
        Assert.assertFalse(CreateTriangle.getTriangle(1, 1, 5));
    }
    /*5*/
    @Test
    public void IsFalseWhenTheSumOfTwoEqualSidesIsEqualToThird() {
        Assert.assertFalse(CreateTriangle.getTriangle(1, 1, 2));
    }
    /*6*/
    @Test
    public void IsFalseWhenTheThirdSideIsZero() {
        Assert.assertFalse(CreateTriangle.getTriangle(1, 2, 0));
    }

    /*7*/
    @Test
    public void IsFalseWhenTheSecondSideIsZero() {
        Assert.assertFalse(CreateTriangle.getTriangle(1, 0, 2));
    }

    /*8*/
    @Test
    public void IsFalseWhenTheFirstSideIsZero() {
        Assert.assertFalse(CreateTriangle.getTriangle(0, 1, 2));
    }

    /*9*/
    @Test
    public void IsFalseWhenTheFirstSideIsNegative() {
        Assert.assertFalse(CreateTriangle.getTriangle(-1, 1, 2));
    }

    /*10*/
    @Test
    public void IsFalseWhenTheSecondSideIsNegative() {
        Assert.assertFalse(CreateTriangle.getTriangle(1, -1, 2));
    }

}