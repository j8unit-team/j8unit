package org.j8unit.repository.java.lang.instrument;

import java.lang.instrument.IllegalClassFormatException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IllegalClassFormatExceptionClassTest
implements org.j8unit.repository.java.lang.instrument.IllegalClassFormatExceptionClassTests<IllegalClassFormatException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.instrument.IllegalClassFormatException]

    @Override
    public Class<IllegalClassFormatException> createNewSUT() {
        return IllegalClassFormatException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.lang.instrument.IllegalClassFormatException#IllegalClassFormatException() public
     * java.lang.instrument.IllegalClassFormatException()}.
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
    public void create_IllegalClassFormatException()
    throws Exception {
        // create new instance
        final IllegalClassFormatException sut = new IllegalClassFormatException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.lang.instrument.IllegalClassFormatException#IllegalClassFormatException(String) public
     * java.lang.instrument.IllegalClassFormatException(java.lang.String)}.
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
    public void create_IllegalClassFormatException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final IllegalClassFormatException sut = null; // = new IllegalClassFormatException(String);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.instrument.IllegalClassFormatException]

}
