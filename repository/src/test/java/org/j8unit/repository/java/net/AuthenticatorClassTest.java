package org.j8unit.repository.java.net;

import static org.junit.Assert.fail;
import java.net.Authenticator;
import java.net.Authenticator.RequestorType;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Authenticator} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.net.AuthenticatorClassTests}).
 */
@RunWith(J8Unit4.class)
public class AuthenticatorClassTest
implements AuthenticatorClassTests<Authenticator> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.net.Authenticator]

    @Override
    public Class<Authenticator> createNewSUT() {
        return Authenticator.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.net.Authenticator#Authenticator() public
     * java.net.Authenticator()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("Cannot construct an abstract class!")
    @Test
    @Category(Draft.class)
    public void create_Authenticator()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.net.Authenticator#requestPasswordAuthentication(java.net.InetAddress, int, String, String, String)
     * public static java.net.PasswordAuthentication
     * java.net.Authenticator.requestPasswordAuthentication(java.net.InetAddress,int,java.lang.String,java.lang.String,java.lang.String)}.
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
    public void test_requestPasswordAuthentication_InetAddress_int_String_String_String()
    throws Exception {
        // write some test for {@link java.net.Authenticator#requestPasswordAuthentication(java.net.InetAddress, int,
        // String, String, String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.net.Authenticator#requestPasswordAuthentication(String, java.net.InetAddress, int, String, String, String)
     * public static java.net.PasswordAuthentication
     * java.net.Authenticator.requestPasswordAuthentication(java.lang.String,java.net.InetAddress,int,java.lang.String,java.lang.String,java.lang.String)}.
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
    public void test_requestPasswordAuthentication_String_InetAddress_int_String_String_String()
    throws Exception {
        // write some test for {@link java.net.Authenticator#requestPasswordAuthentication(String, java.net.InetAddress,
        // int, String, String, String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.net.Authenticator#requestPasswordAuthentication(String, java.net.InetAddress, int, String, String, String, java.net.URL, java.net.Authenticator.RequestorType)
     * public static java.net.PasswordAuthentication
     * java.net.Authenticator.requestPasswordAuthentication(java.lang.String,java.net.InetAddress,int,java.lang.String,java.lang.String,java.lang.String,java.net.URL,java.net.Authenticator$RequestorType)}.
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
    public void test_requestPasswordAuthentication_String_InetAddress_int_String_String_String_URL_RequestorType()
    throws Exception {
        // write some test for {@link java.net.Authenticator#requestPasswordAuthentication(String, java.net.InetAddress,
        // int, String, String, String, java.net.URL, java.net.Authenticator.RequestorType)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.net.Authenticator#setDefault(java.net.Authenticator) public static synchronized void
     * java.net.Authenticator.setDefault(java.net.Authenticator)}.
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
    public void test_setDefault_Authenticator()
    throws Exception {
        // write some test for {@link java.net.Authenticator#setDefault(java.net.Authenticator)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.net.Authenticator]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.net.Authenticator]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link RequestorType} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.java.net.AuthenticatorClassTests.RequestorTypeClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class RequestorTypeClassTest
    implements RequestorTypeClassTests<RequestorType> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.net.Authenticator$RequestorType]

        @Override
        public Class<RequestorType> createNewSUT() {
            return RequestorType.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test {@link java.net.Authenticator.RequestorType#values()
         * public static java.net.Authenticator$RequestorType[] java.net.Authenticator$RequestorType.values()}.
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
            // write some test for {@link java.net.Authenticator.RequestorType#values()}
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link java.net.Authenticator.RequestorType#valueOf(String) public static
         * java.net.Authenticator$RequestorType java.net.Authenticator$RequestorType.valueOf(java.lang.String)}.
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
            // write some test for {@link java.net.Authenticator.RequestorType#valueOf(String)}
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.net.Authenticator$RequestorType]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.net.Authenticator$RequestorType]

    }

}
