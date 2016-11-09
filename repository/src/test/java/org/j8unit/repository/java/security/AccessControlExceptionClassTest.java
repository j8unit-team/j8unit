package org.j8unit.repository.java.security;

import java.security.AccessControlException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AccessControlException} (by simply
 * reusing the J8Unit test interface {@link AccessControlExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class AccessControlExceptionClassTest
implements AccessControlExceptionClassTests<AccessControlException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.AccessControlException]

    @Override
    public Class<AccessControlException> createNewSUT() {
        return AccessControlException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.AccessControlException#AccessControlException(String) public
     * java.security.AccessControlException(java.lang.String)}.
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
    public void create_AccessControlException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final AccessControlException sut = null; // = new AccessControlException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.AccessControlException#AccessControlException(String, java.security.Permission) public
     * java.security.AccessControlException(java.lang.String,java.security.Permission)}.
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
    public void create_AccessControlException_String_Permission()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final AccessControlException sut = null; // = new AccessControlException(String, java.security.Permission);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.AccessControlException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.AccessControlException]

}
