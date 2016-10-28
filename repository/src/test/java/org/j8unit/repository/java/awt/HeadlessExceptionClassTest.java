package org.j8unit.repository.java.awt;

import java.awt.HeadlessException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HeadlessExceptionClassTest
implements org.j8unit.repository.java.awt.HeadlessExceptionClassTests<HeadlessException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.HeadlessException]

    @Override
    public Class<HeadlessException> createNewSUT() {
        return HeadlessException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.awt.HeadlessException#HeadlessException()
     * public java.awt.HeadlessException()}.
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
    public void create_HeadlessException()
    throws Exception {
        // create new instance
        final HeadlessException sut = new HeadlessException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.HeadlessException#HeadlessException(String) public java.awt.HeadlessException(java.lang.String)}.
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
    public void create_HeadlessException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final HeadlessException sut = null; // = new HeadlessException(String);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.HeadlessException]

}
