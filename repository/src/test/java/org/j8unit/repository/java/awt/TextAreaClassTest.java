package org.j8unit.repository.java.awt;

import java.awt.TextArea;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TextArea} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.awt.TextAreaClassTests}).
 */

@RunWith(J8Unit4.class)
public class TextAreaClassTest
implements TextAreaClassTests<TextArea> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.TextArea]

    @Override
    public Class<TextArea> createNewSUT() {
        return TextArea.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.awt.TextArea#TextArea(String) public
     * java.awt.TextArea(java.lang.String) throws java.awt.HeadlessException}.
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
    public void create_TextArea_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final TextArea sut = null; // = new TextArea(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.awt.TextArea#TextArea() public
     * java.awt.TextArea() throws java.awt.HeadlessException}.
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
    public void create_TextArea()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final TextArea sut = new TextArea();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.TextArea#TextArea(String, int, int, int) public java.awt.TextArea(java.lang.String,int,int,int)
     * throws java.awt.HeadlessException}.
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
    public void create_TextArea_String_int_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final TextArea sut = null; // = new TextArea(String, int, int, int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.awt.TextArea#TextArea(int, int) public
     * java.awt.TextArea(int,int) throws java.awt.HeadlessException}.
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
    public void create_TextArea_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final TextArea sut = null; // = new TextArea(int, int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.awt.TextArea#TextArea(String, int, int)
     * public java.awt.TextArea(java.lang.String,int,int) throws java.awt.HeadlessException}.
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
    public void create_TextArea_String_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final TextArea sut = null; // = new TextArea(String, int, int);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.TextArea]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.TextArea]

}
