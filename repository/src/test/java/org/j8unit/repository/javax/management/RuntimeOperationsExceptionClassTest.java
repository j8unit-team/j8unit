package org.j8unit.repository.javax.management;

import javax.management.RuntimeOperationsException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RuntimeOperationsException} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.management.RuntimeOperationsExceptionClassTests}).
 */
@RunWith(J8Unit4.class)
public class RuntimeOperationsExceptionClassTest
implements RuntimeOperationsExceptionClassTests<RuntimeOperationsException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.RuntimeOperationsException]

    @Override
    public Class<RuntimeOperationsException> createNewSUT() {
        return RuntimeOperationsException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.RuntimeOperationsException#RuntimeOperationsException(RuntimeException) public
     * javax.management.RuntimeOperationsException(java.lang.RuntimeException)}.
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
    public void create_RuntimeOperationsException_RuntimeException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final RuntimeOperationsException sut = null; // = new RuntimeOperationsException(RuntimeException);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.RuntimeOperationsException#RuntimeOperationsException(RuntimeException, String) public
     * javax.management.RuntimeOperationsException(java.lang.RuntimeException,java.lang.String)}.
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
    public void create_RuntimeOperationsException_RuntimeException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final RuntimeOperationsException sut = null; // = new RuntimeOperationsException(RuntimeException, String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.RuntimeOperationsException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.RuntimeOperationsException]

}
