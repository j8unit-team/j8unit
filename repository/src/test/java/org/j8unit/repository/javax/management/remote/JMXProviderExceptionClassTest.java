package org.j8unit.repository.javax.management.remote;

import javax.management.remote.JMXProviderException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link JMXProviderException} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.management.remote.JMXProviderExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class JMXProviderExceptionClassTest
implements JMXProviderExceptionClassTests<JMXProviderException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.remote.JMXProviderException]

    @Override
    public Class<JMXProviderException> createNewSUT() {
        return JMXProviderException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.remote.JMXProviderException#JMXProviderException(String, Throwable) public
     * javax.management.remote.JMXProviderException(java.lang.String,java.lang.Throwable)}.
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
    public void create_JMXProviderException_String_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JMXProviderException sut = null; // = new JMXProviderException(String, Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.remote.JMXProviderException#JMXProviderException(String) public
     * javax.management.remote.JMXProviderException(java.lang.String)}.
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
    public void create_JMXProviderException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JMXProviderException sut = null; // = new JMXProviderException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.remote.JMXProviderException#JMXProviderException() public
     * javax.management.remote.JMXProviderException()}.
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
    public void create_JMXProviderException()
    throws Exception {
        // create new instance
        final JMXProviderException sut = new JMXProviderException();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.remote.JMXProviderException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.remote.JMXProviderException]

}
