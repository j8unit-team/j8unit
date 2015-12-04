package org.j8unit.repository.javax.net.ssl;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.net.ssl.SSLServerSocketFactory class javax.net.ssl.SSLServerSocketFactory}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.net.ssl.SSLServerSocketFactoryClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface SSLServerSocketFactoryTests<SUT extends javax.net.ssl.SSLServerSocketFactory>
extends org.j8unit.repository.javax.net.ServerSocketFactoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLServerSocketFactory#getDefaultCipherSuites() public abstract
     * java.lang.String[] javax.net.ssl.SSLServerSocketFactory.getDefaultCipherSuites()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDefaultCipherSuites()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLServerSocketFactory#getSupportedCipherSuites() public abstract
     * java.lang.String[] javax.net.ssl.SSLServerSocketFactory.getSupportedCipherSuites()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSupportedCipherSuites()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
