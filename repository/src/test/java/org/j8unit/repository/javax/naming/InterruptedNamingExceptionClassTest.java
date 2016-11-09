package org.j8unit.repository.javax.naming;

import javax.naming.InterruptedNamingException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link InterruptedNamingException} (by simply
 * reusing the J8Unit test interface {@link InterruptedNamingExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class InterruptedNamingExceptionClassTest
implements InterruptedNamingExceptionClassTests<InterruptedNamingException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.InterruptedNamingException]

    @Override
    public Class<InterruptedNamingException> createNewSUT() {
        return InterruptedNamingException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.InterruptedNamingException#InterruptedNamingException(String) public
     * javax.naming.InterruptedNamingException(java.lang.String)}.
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
    public void create_InterruptedNamingException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final InterruptedNamingException sut = null; // = new InterruptedNamingException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.InterruptedNamingException#InterruptedNamingException() public
     * javax.naming.InterruptedNamingException()}.
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
    public void create_InterruptedNamingException()
    throws Exception {
        // create new instance
        final InterruptedNamingException sut = new InterruptedNamingException();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.naming.InterruptedNamingException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.InterruptedNamingException]

}
