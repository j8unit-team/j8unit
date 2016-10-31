package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NumberFormatExceptionClassTest
implements org.j8unit.repository.java.lang.NumberFormatExceptionClassTests<NumberFormatException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.NumberFormatException]

    @Override
    public Class<NumberFormatException> createNewSUT() {
        return NumberFormatException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link NumberFormatException#NumberFormatException()
     * public java.lang.NumberFormatException()}.
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
    public void create_NumberFormatException()
    throws Exception {
        // create new instance
        final NumberFormatException sut = new NumberFormatException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link NumberFormatException#NumberFormatException(String) public
     * java.lang.NumberFormatException(java.lang.String)}.
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
    public void create_NumberFormatException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final NumberFormatException sut = null; // = new NumberFormatException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.NumberFormatException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.NumberFormatException]

}
