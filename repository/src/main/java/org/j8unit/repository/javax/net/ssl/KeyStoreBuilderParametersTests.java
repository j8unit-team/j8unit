package org.j8unit.repository.javax.net.ssl;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.net.ssl.KeyStoreBuilderParameters class
 * javax.net.ssl.KeyStoreBuilderParameters}, containing all instance relevant test methods (i.&thinsp;e., test methods
 * of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.net.ssl.KeyStoreBuilderParametersTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.net.ssl.KeyStoreBuilderParametersClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.net.ssl.KeyStoreBuilderParameters
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface KeyStoreBuilderParametersTests<SUT extends javax.net.ssl.KeyStoreBuilderParameters>
extends org.j8unit.repository.javax.net.ssl.ManagerFactoryParametersTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.net.ssl.KeyStoreBuilderParameters#getParameters() public java.util.List
     * javax.net.ssl.KeyStoreBuilderParameters.getParameters()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.net.ssl.KeyStoreBuilderParameters#getParameters()
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
