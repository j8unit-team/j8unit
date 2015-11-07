package org.j8unit.shapes;

import static org.junit.Assert.assertEquals;
import org.j8unit.runners.J8Unit4;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JMSquareTest
implements RectangleTest<Square> {

    @Override
    public Square createNewSUT() {
        return new Square(2.0);
    }

    @Test
    public void testWidthAndHeightEqual() {
        final Square sut = this.createNewSUT();
        assertEquals(sut.getWidth(), sut.getHeight(), 0.0);
    }

    @Test
    @Category(ShowcaseFailure.class)
    @Override
    public void testScalingAreaByScalingHeight() {
        RectangleTest.super.testScalingAreaByScalingHeight();
    }

    @Test
    @Category(ShowcaseFailure.class)
    @Override
    public void testScalingAreaByScalingWidth() {
        RectangleTest.super.testScalingAreaByScalingWidth();
    }

}
