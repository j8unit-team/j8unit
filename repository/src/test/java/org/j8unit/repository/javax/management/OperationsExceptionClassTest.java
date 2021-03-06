package org.j8unit.repository.javax.management;

import javax.management.OperationsException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link OperationsException} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.management.OperationsExceptionClassTests}).
 */
@RunWith(J8Unit4.class)
public class OperationsExceptionClassTest
implements OperationsExceptionClassTests<OperationsException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.OperationsException]

    @Override
    public Class<OperationsException> createNewSUT() {
        return OperationsException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.OperationsException#OperationsException() public javax.management.OperationsException()}.
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
    public void create_OperationsException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final OperationsException sut = new OperationsException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.OperationsException#OperationsException(String) public
     * javax.management.OperationsException(java.lang.String)}.
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
    public void create_OperationsException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final OperationsException sut = null; // = new OperationsException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.OperationsException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.OperationsException]

}
