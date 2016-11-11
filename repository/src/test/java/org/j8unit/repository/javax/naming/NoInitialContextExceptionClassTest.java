package org.j8unit.repository.javax.naming;

import javax.naming.NoInitialContextException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link NoInitialContextException} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.naming.NoInitialContextExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class NoInitialContextExceptionClassTest
implements NoInitialContextExceptionClassTests<NoInitialContextException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.NoInitialContextException]

    @Override
    public Class<NoInitialContextException> createNewSUT() {
        return NoInitialContextException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.NoInitialContextException#NoInitialContextException() public
     * javax.naming.NoInitialContextException()}.
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
    public void create_NoInitialContextException()
    throws Exception {
        // create new instance
        final NoInitialContextException sut = new NoInitialContextException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.NoInitialContextException#NoInitialContextException(String) public
     * javax.naming.NoInitialContextException(java.lang.String)}.
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
    public void create_NoInitialContextException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final NoInitialContextException sut = null; // = new NoInitialContextException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.naming.NoInitialContextException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.NoInitialContextException]

}
