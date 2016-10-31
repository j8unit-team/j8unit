package org.j8unit.repository.java.awt;

import java.awt.Label;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LabelClassTest
implements org.j8unit.repository.java.awt.LabelClassTests<Label> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.Label]

    @Override
    public Class<Label> createNewSUT() {
        return Label.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.awt.Label#Label() public java.awt.Label()
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
    public void create_Label()
    throws Exception {
        // create new instance
        final Label sut = new Label();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.awt.Label#Label(String) public
     * java.awt.Label(java.lang.String) throws java.awt.HeadlessException}.
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
    public void create_Label_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Label sut = null; // = new Label(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.awt.Label#Label(String, int) public
     * java.awt.Label(java.lang.String,int) throws java.awt.HeadlessException}.
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
    public void create_Label_String_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Label sut = null; // = new Label(String, int);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.Label]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.Label]

}
