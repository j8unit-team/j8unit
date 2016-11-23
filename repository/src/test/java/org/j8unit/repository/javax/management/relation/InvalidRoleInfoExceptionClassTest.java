package org.j8unit.repository.javax.management.relation;

import javax.management.relation.InvalidRoleInfoException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link InvalidRoleInfoException} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.management.relation.InvalidRoleInfoExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class InvalidRoleInfoExceptionClassTest
implements InvalidRoleInfoExceptionClassTests<InvalidRoleInfoException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.relation.InvalidRoleInfoException]

    @Override
    public Class<InvalidRoleInfoException> createNewSUT() {
        return InvalidRoleInfoException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.relation.InvalidRoleInfoException#InvalidRoleInfoException() public
     * javax.management.relation.InvalidRoleInfoException()}.
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
    public void create_InvalidRoleInfoException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final InvalidRoleInfoException sut = new InvalidRoleInfoException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.relation.InvalidRoleInfoException#InvalidRoleInfoException(String) public
     * javax.management.relation.InvalidRoleInfoException(java.lang.String)}.
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
    public void create_InvalidRoleInfoException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final InvalidRoleInfoException sut = null; // = new InvalidRoleInfoException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.relation.InvalidRoleInfoException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.relation.InvalidRoleInfoException]

}
