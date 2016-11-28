package org.j8unit.repository.java.security;

import java.security.UnrecoverableEntryException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link UnrecoverableEntryException} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.security.UnrecoverableEntryExceptionClassTests}).
 */
@RunWith(J8Unit4.class)
public class UnrecoverableEntryExceptionClassTest
implements UnrecoverableEntryExceptionClassTests<UnrecoverableEntryException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.UnrecoverableEntryException]

    @Override
    public Class<UnrecoverableEntryException> createNewSUT() {
        return UnrecoverableEntryException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.UnrecoverableEntryException#UnrecoverableEntryException() public
     * java.security.UnrecoverableEntryException()}.
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
    public void create_UnrecoverableEntryException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final UnrecoverableEntryException sut = new UnrecoverableEntryException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.UnrecoverableEntryException#UnrecoverableEntryException(String) public
     * java.security.UnrecoverableEntryException(java.lang.String)}.
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
    public void create_UnrecoverableEntryException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final UnrecoverableEntryException sut = null; // = new UnrecoverableEntryException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.UnrecoverableEntryException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.UnrecoverableEntryException]

}
