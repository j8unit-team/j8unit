package org.j8unit.repository.javax.net.ssl;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.net.ssl.SSLEngineResult class javax.net.ssl.SSLEngineResult},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.net.ssl.SSLEngineResultTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.net.ssl.SSLEngineResultClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.net.ssl.SSLEngineResult
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SSLEngineResultTests<SUT extends javax.net.ssl.SSLEngineResult>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.net.ssl.SSLEngineResult.HandshakeStatus class
     * javax.net.ssl.SSLEngineResult$HandshakeStatus}, containing all instance relevant test methods (i.&thinsp;e., test
     * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
     * methods is {@link org.j8unit.repository.javax.net.ssl.SSLEngineResultTests.HandshakeStatusTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.net.ssl.SSLEngineResultClassTests.HandshakeStatusClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.net.ssl.SSLEngineResult.HandshakeStatus
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface HandshakeStatusTests<SUT extends javax.net.ssl.SSLEngineResult.HandshakeStatus>
    extends org.j8unit.repository.java.lang.EnumTests<SUT, javax.net.ssl.SSLEngineResult.HandshakeStatus> {

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.net.ssl.SSLEngineResult.Status class
     * javax.net.ssl.SSLEngineResult$Status}, containing all instance relevant test methods (i.&thinsp;e., test methods
     * of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods
     * is {@link org.j8unit.repository.javax.net.ssl.SSLEngineResultTests.StatusTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.net.ssl.SSLEngineResultClassTests.StatusClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.net.ssl.SSLEngineResult.Status
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface StatusTests<SUT extends javax.net.ssl.SSLEngineResult.Status>
    extends org.j8unit.repository.java.lang.EnumTests<SUT, javax.net.ssl.SSLEngineResult.Status> {

    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLEngineResult#bytesConsumed() public final int
     * javax.net.ssl.SSLEngineResult.bytesConsumed()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.net.ssl.SSLEngineResult#bytesConsumed()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_bytesConsumed()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLEngineResult#bytesProduced() public final int
     * javax.net.ssl.SSLEngineResult.bytesProduced()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.net.ssl.SSLEngineResult#bytesProduced()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_bytesProduced()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLEngineResult#getHandshakeStatus() public final
     * javax.net.ssl.SSLEngineResult$HandshakeStatus javax.net.ssl.SSLEngineResult.getHandshakeStatus()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.net.ssl.SSLEngineResult#getHandshakeStatus()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getHandshakeStatus()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLEngineResult#getStatus() public final
     * javax.net.ssl.SSLEngineResult$Status javax.net.ssl.SSLEngineResult.getStatus()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.net.ssl.SSLEngineResult#getStatus()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getStatus()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLEngineResult#toString() public java.lang.String
     * javax.net.ssl.SSLEngineResult.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.net.ssl.SSLEngineResult#toString()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_toString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
