package org.j8unit.repository.javax.net.ssl;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.net.ssl.KeyStoreBuilderParameters class
 * javax.net.ssl.KeyStoreBuilderParameters}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link KeyStoreBuilderParametersClassTests}.
 * </p>
 *
 * @see javax.net.ssl.KeyStoreBuilderParameters class javax.net.ssl.KeyStoreBuilderParameters (the hereby targeted
 *      class-under-test class)
 * @see KeyStoreBuilderParametersClassTests KeyStoreBuilderParametersClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface KeyStoreBuilderParametersTests<SUT extends javax.net.ssl.KeyStoreBuilderParameters>
extends ManagerFactoryParametersTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.net.ssl.KeyStoreBuilderParameters#getParameters() public java.util.List
     * <java.security.KeyStore$Builder> javax.net.ssl.KeyStoreBuilderParameters.getParameters()}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.KeyStoreBuilderParameters#getParameters() public java.util.List
     * javax.net.ssl.KeyStoreBuilderParameters.getParameters()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.KeyStoreBuilderParameters#getParameters() public java.util.List
     *      javax.net.ssl.KeyStoreBuilderParameters.getParameters() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getParameters()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
