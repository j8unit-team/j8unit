package org.j8unit.repository.javax.swing.text;

import javax.swing.text.Segment;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Segment} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.swing.text.SegmentClassTests}).
 */
@RunWith(J8Unit4.class)
public class SegmentClassTest
implements SegmentClassTests<Segment> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.Segment]

    @Override
    public Class<Segment> createNewSUT() {
        return Segment.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.text.Segment#Segment(char[], int, int) public javax.swing.text.Segment(char[],int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_Segment_charArray_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Segment sut = null; // = new Segment(char[], int, int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.text.Segment#Segment() public
     * javax.swing.text.Segment()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_Segment()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Segment sut = new Segment();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.Segment]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.Segment]

}
