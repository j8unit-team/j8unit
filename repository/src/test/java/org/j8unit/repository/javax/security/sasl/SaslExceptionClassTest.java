package org.j8unit.repository.javax.security.sasl;

import javax.security.sasl.SaslException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SaslException} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.security.sasl.SaslExceptionClassTests}).
 */
@RunWith(J8Unit4.class)
public class SaslExceptionClassTest
implements SaslExceptionClassTests<SaslException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.security.sasl.SaslException]

    @Override
    public Class<SaslException> createNewSUT() {
        return SaslException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.security.sasl.SaslException#SaslException(String, Throwable) public
     * javax.security.sasl.SaslException(java.lang.String,java.lang.Throwable)}.
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
    public void create_SaslException_String_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SaslException sut = null; // = new SaslException(String, Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.security.sasl.SaslException#SaslException(String) public
     * javax.security.sasl.SaslException(java.lang.String)}.
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
    public void create_SaslException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SaslException sut = null; // = new SaslException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.security.sasl.SaslException#SaslException() public javax.security.sasl.SaslException()}.
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
    public void create_SaslException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SaslException sut = new SaslException();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.security.sasl.SaslException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.security.sasl.SaslException]

}
