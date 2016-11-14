package org.j8unit.repository.java.text;

import java.text.FieldPosition;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link FieldPosition} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.text.FieldPositionClassTests}).
 */

@RunWith(J8Unit4.class)
public class FieldPositionClassTest
implements FieldPositionClassTests<FieldPosition> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.text.FieldPosition]

    @Override
    public Class<FieldPosition> createNewSUT() {
        return FieldPosition.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.text.FieldPosition#FieldPosition(int)
     * public java.text.FieldPosition(int)}.
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
    public void create_FieldPosition_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FieldPosition sut = null; // = new FieldPosition(int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.text.FieldPosition#FieldPosition(java.text.Format.Field) public
     * java.text.FieldPosition(java.text.Format$Field)}.
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
    public void create_FieldPosition_Field()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FieldPosition sut = null; // = new FieldPosition(java.text.Format.Field);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.text.FieldPosition#FieldPosition(java.text.Format.Field, int) public
     * java.text.FieldPosition(java.text.Format$Field,int)}.
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
    public void create_FieldPosition_Field_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FieldPosition sut = null; // = new FieldPosition(java.text.Format.Field, int);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.text.FieldPosition]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.text.FieldPosition]

}
