package org.j8unit.repository.java.security.cert;

import java.security.cert.CertPathValidatorException;
import java.security.cert.CertPathValidatorException.BasicReason;
import java.security.cert.CertPathValidatorException.Reason;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CertPathValidatorException} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.security.cert.CertPathValidatorExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class CertPathValidatorExceptionClassTest
implements CertPathValidatorExceptionClassTests<CertPathValidatorException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.cert.CertPathValidatorException]

    @Override
    public Class<CertPathValidatorException> createNewSUT() {
        return CertPathValidatorException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.cert.CertPathValidatorException#CertPathValidatorException(String, Throwable, java.security.cert.CertPath, int, java.security.cert.CertPathValidatorException.Reason)
     * public
     * java.security.cert.CertPathValidatorException(java.lang.String,java.lang.Throwable,java.security.cert.CertPath,int,java.security.cert.CertPathValidatorException$Reason)}.
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
    public void create_CertPathValidatorException_String_Throwable_CertPath_int_Reason()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CertPathValidatorException sut = null; // = new CertPathValidatorException(String, Throwable,
                                                     // java.security.cert.CertPath, int,
                                                     // java.security.cert.CertPathValidatorException.Reason);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.cert.CertPathValidatorException#CertPathValidatorException(String, Throwable, java.security.cert.CertPath, int)
     * public
     * java.security.cert.CertPathValidatorException(java.lang.String,java.lang.Throwable,java.security.cert.CertPath,int)}.
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
    public void create_CertPathValidatorException_String_Throwable_CertPath_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CertPathValidatorException sut = null; // = new CertPathValidatorException(String, Throwable,
                                                     // java.security.cert.CertPath, int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.cert.CertPathValidatorException#CertPathValidatorException() public
     * java.security.cert.CertPathValidatorException()}.
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
    public void create_CertPathValidatorException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CertPathValidatorException sut = new CertPathValidatorException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.cert.CertPathValidatorException#CertPathValidatorException(String) public
     * java.security.cert.CertPathValidatorException(java.lang.String)}.
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
    public void create_CertPathValidatorException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CertPathValidatorException sut = null; // = new CertPathValidatorException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.cert.CertPathValidatorException#CertPathValidatorException(Throwable) public
     * java.security.cert.CertPathValidatorException(java.lang.Throwable)}.
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
    public void create_CertPathValidatorException_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CertPathValidatorException sut = null; // = new CertPathValidatorException(Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.cert.CertPathValidatorException#CertPathValidatorException(String, Throwable) public
     * java.security.cert.CertPathValidatorException(java.lang.String,java.lang.Throwable)}.
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
    public void create_CertPathValidatorException_String_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CertPathValidatorException sut = null; // = new CertPathValidatorException(String, Throwable);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.cert.CertPathValidatorException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.cert.CertPathValidatorException]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link Reason} (by simply reusing the J8Unit
     * test interface
     * {@link org.j8unit.repository.java.security.cert.CertPathValidatorExceptionClassTests.ReasonClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class ReasonClassTest
    implements ReasonClassTests<Reason> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.cert.CertPathValidatorException$Reason]

        @Override
        public Class<Reason> createNewSUT() {
            return Reason.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.cert.CertPathValidatorException$Reason]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.security.cert.CertPathValidatorException$Reason]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link BasicReason} (by simply reusing the
     * J8Unit test interface
     * {@link org.j8unit.repository.java.security.cert.CertPathValidatorExceptionClassTests.BasicReasonClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class BasicReasonClassTest
    implements BasicReasonClassTests<BasicReason> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.cert.CertPathValidatorException$BasicReason]

        @Override
        public Class<BasicReason> createNewSUT() {
            return BasicReason.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link java.security.cert.CertPathValidatorException.BasicReason#values() public static
         * java.security.cert.CertPathValidatorException$BasicReason[]
         * java.security.cert.CertPathValidatorException$BasicReason.values()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void test_values()
        throws Exception {
            // write some test for {@link java.security.cert.CertPathValidatorException.BasicReason#values()}
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link java.security.cert.CertPathValidatorException.BasicReason#valueOf(String) public static
         * java.security.cert.CertPathValidatorException$BasicReason
         * java.security.cert.CertPathValidatorException$BasicReason.valueOf(java.lang.String)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void test_valueOf_String()
        throws Exception {
            // write some test for {@link java.security.cert.CertPathValidatorException.BasicReason#valueOf(String)}
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.cert.CertPathValidatorException$BasicReason]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.security.cert.CertPathValidatorException$BasicReason]

    }

}
