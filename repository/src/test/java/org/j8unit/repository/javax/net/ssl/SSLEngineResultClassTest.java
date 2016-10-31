package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLEngineResult.HandshakeStatus;
import javax.net.ssl.SSLEngineResult.Status;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SSLEngineResultClassTest
implements org.j8unit.repository.javax.net.ssl.SSLEngineResultClassTests<SSLEngineResult> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.net.ssl.SSLEngineResult]

    @Override
    public Class<SSLEngineResult> createNewSUT() {
        return SSLEngineResult.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.net.ssl.SSLEngineResult#SSLEngineResult(javax.net.ssl.SSLEngineResult.Status, javax.net.ssl.SSLEngineResult.HandshakeStatus, int, int)
     * public
     * javax.net.ssl.SSLEngineResult(javax.net.ssl.SSLEngineResult$Status,javax.net.ssl.SSLEngineResult$HandshakeStatus,int,int)}.
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
    public void create_SSLEngineResult_Status_HandshakeStatus_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SSLEngineResult sut = null; // = new SSLEngineResult(javax.net.ssl.SSLEngineResult.Status,
                                          // javax.net.ssl.SSLEngineResult.HandshakeStatus, int, int);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.net.ssl.SSLEngineResult]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.net.ssl.SSLEngineResult]

    @RunWith(J8Unit4.class)
    public static class HandshakeStatusClassTest
    implements org.j8unit.repository.javax.net.ssl.SSLEngineResultClassTests.HandshakeStatusClassTests<HandshakeStatus> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.net.ssl.SSLEngineResult$HandshakeStatus]

        @Override
        public Class<HandshakeStatus> createNewSUT() {
            return HandshakeStatus.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.net.ssl.SSLEngineResult.HandshakeStatus#values() public static
         * javax.net.ssl.SSLEngineResult$HandshakeStatus[] javax.net.ssl.SSLEngineResult$HandshakeStatus.values()}.
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
            // write some test for {@link javax.net.ssl.SSLEngineResult.HandshakeStatus#values()}
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.net.ssl.SSLEngineResult.HandshakeStatus#valueOf(String) public static
         * javax.net.ssl.SSLEngineResult$HandshakeStatus
         * javax.net.ssl.SSLEngineResult$HandshakeStatus.valueOf(java.lang.String)}.
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
            // write some test for {@link javax.net.ssl.SSLEngineResult.HandshakeStatus#valueOf(String)}
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.net.ssl.SSLEngineResult$HandshakeStatus]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.net.ssl.SSLEngineResult$HandshakeStatus]

    }

    @RunWith(J8Unit4.class)
    public static class StatusClassTest
    implements org.j8unit.repository.javax.net.ssl.SSLEngineResultClassTests.StatusClassTests<Status> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.net.ssl.SSLEngineResult$Status]

        @Override
        public Class<Status> createNewSUT() {
            return Status.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.net.ssl.SSLEngineResult.Status#valueOf(String) public static
         * javax.net.ssl.SSLEngineResult$Status javax.net.ssl.SSLEngineResult$Status.valueOf(java.lang.String)}.
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
            // write some test for {@link javax.net.ssl.SSLEngineResult.Status#valueOf(String)}
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test {@link javax.net.ssl.SSLEngineResult.Status#values()
         * public static javax.net.ssl.SSLEngineResult$Status[] javax.net.ssl.SSLEngineResult$Status.values()}.
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
            // write some test for {@link javax.net.ssl.SSLEngineResult.Status#values()}
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.net.ssl.SSLEngineResult$Status]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.net.ssl.SSLEngineResult$Status]

    }

}
