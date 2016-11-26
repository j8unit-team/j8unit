package org.j8unit.repository.java.lang.invoke;

import java.lang.invoke.WrongMethodTypeException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link WrongMethodTypeException} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.lang.invoke.WrongMethodTypeExceptionClassTests}).
 */
@RunWith(J8Unit4.class)
public class WrongMethodTypeExceptionClassTest
implements WrongMethodTypeExceptionClassTests<WrongMethodTypeException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.invoke.WrongMethodTypeException]

    @Override
    public Class<WrongMethodTypeException> createNewSUT() {
        return WrongMethodTypeException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.lang.invoke.WrongMethodTypeException#WrongMethodTypeException(String) public
     * java.lang.invoke.WrongMethodTypeException(java.lang.String)}.
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
    public void create_WrongMethodTypeException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final WrongMethodTypeException sut = null; // = new WrongMethodTypeException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.lang.invoke.WrongMethodTypeException#WrongMethodTypeException() public
     * java.lang.invoke.WrongMethodTypeException()}.
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
    public void create_WrongMethodTypeException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final WrongMethodTypeException sut = new WrongMethodTypeException();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.invoke.WrongMethodTypeException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.invoke.WrongMethodTypeException]

}
