package org.j8unit.repository.javax.management.modelmbean;

import javax.management.modelmbean.InvalidTargetObjectTypeException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link InvalidTargetObjectTypeException} (by
 * simply reusing the J8Unit test interface {@link InvalidTargetObjectTypeExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class InvalidTargetObjectTypeExceptionClassTest
implements InvalidTargetObjectTypeExceptionClassTests<InvalidTargetObjectTypeException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.modelmbean.InvalidTargetObjectTypeException]

    @Override
    public Class<InvalidTargetObjectTypeException> createNewSUT() {
        return InvalidTargetObjectTypeException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.modelmbean.InvalidTargetObjectTypeException#InvalidTargetObjectTypeException(Exception, String)
     * public javax.management.modelmbean.InvalidTargetObjectTypeException(java.lang.Exception,java.lang.String)}.
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
    public void create_InvalidTargetObjectTypeException_Exception_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final InvalidTargetObjectTypeException sut = null; // = new InvalidTargetObjectTypeException(Exception, String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.modelmbean.InvalidTargetObjectTypeException#InvalidTargetObjectTypeException(String)
     * public javax.management.modelmbean.InvalidTargetObjectTypeException(java.lang.String)}.
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
    public void create_InvalidTargetObjectTypeException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final InvalidTargetObjectTypeException sut = null; // = new InvalidTargetObjectTypeException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.modelmbean.InvalidTargetObjectTypeException#InvalidTargetObjectTypeException() public
     * javax.management.modelmbean.InvalidTargetObjectTypeException()}.
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
    public void create_InvalidTargetObjectTypeException()
    throws Exception {
        // create new instance
        final InvalidTargetObjectTypeException sut = new InvalidTargetObjectTypeException();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.modelmbean.InvalidTargetObjectTypeException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.modelmbean.InvalidTargetObjectTypeException]

}
