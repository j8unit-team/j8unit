package org.j8unit.repository.javax.net.ssl;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.net.ssl.KeyStoreBuilderParameters class javax.net.ssl.KeyStoreBuilderParameters},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.net.ssl.KeyStoreBuilderParametersClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface KeyStoreBuilderParametersTests<SUT extends javax.net.ssl.KeyStoreBuilderParameters>
extends org.j8unit.repository.javax.net.ssl.ManagerFactoryParametersTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.net.ssl.KeyStoreBuilderParameters#getParameters() public java.util.List
     * javax.net.ssl.KeyStoreBuilderParameters.getParameters()}.
     * </p>
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
