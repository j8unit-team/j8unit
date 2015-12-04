package org.j8unit.repository.javax.net.ssl;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.net.ssl.SSLEngineResult class javax.net.ssl.SSLEngineResult}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.net.ssl.SSLEngineResultClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SSLEngineResultTests<SUT extends javax.net.ssl.SSLEngineResult>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test class for {@link javax.net.ssl.SSLEngineResult$HandshakeStatus class
     * javax.net.ssl.SSLEngineResult$HandshakeStatus}, containing all instance relevant test methods (i.&thinsp;e., test
     * methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.net.ssl.SSLEngineResultClassTests.HandshakeStatusClassTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface HandshakeStatusTests<SUT extends javax.net.ssl.SSLEngineResult.HandshakeStatus>
    extends org.j8unit.repository.java.lang.EnumTests<SUT, javax.net.ssl.SSLEngineResult.HandshakeStatus> {

    }

    /**
     * <p>
     * Test class for {@link javax.net.ssl.SSLEngineResult$Status class javax.net.ssl.SSLEngineResult$Status},
     * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.net.ssl.SSLEngineResultClassTests.StatusClassTests
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
     * </p>
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
     * </p>
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
     * </p>
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
     * </p>
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
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_toString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
