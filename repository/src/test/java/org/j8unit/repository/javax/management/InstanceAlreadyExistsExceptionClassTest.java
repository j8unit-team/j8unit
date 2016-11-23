package org.j8unit.repository.javax.management;

import javax.management.InstanceAlreadyExistsException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link InstanceAlreadyExistsException} (by
 * simply reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.management.InstanceAlreadyExistsExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class InstanceAlreadyExistsExceptionClassTest
implements InstanceAlreadyExistsExceptionClassTests<InstanceAlreadyExistsException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.InstanceAlreadyExistsException]

    @Override
    public Class<InstanceAlreadyExistsException> createNewSUT() {
        return InstanceAlreadyExistsException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.InstanceAlreadyExistsException#InstanceAlreadyExistsException() public
     * javax.management.InstanceAlreadyExistsException()}.
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
    public void create_InstanceAlreadyExistsException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final InstanceAlreadyExistsException sut = new InstanceAlreadyExistsException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.InstanceAlreadyExistsException#InstanceAlreadyExistsException(String) public
     * javax.management.InstanceAlreadyExistsException(java.lang.String)}.
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
    public void create_InstanceAlreadyExistsException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final InstanceAlreadyExistsException sut = null; // = new InstanceAlreadyExistsException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.InstanceAlreadyExistsException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.InstanceAlreadyExistsException]

}
