package org.j8unit.repository.java.security.cert;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.security.cert.CollectionCertStoreParameters class
 * java.security.cert.CollectionCertStoreParameters}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.security.cert.CollectionCertStoreParametersClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CollectionCertStoreParametersTests<SUT extends java.security.cert.CollectionCertStoreParameters>
extends org.j8unit.repository.java.security.cert.CertStoreParametersTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.cert.CollectionCertStoreParameters#clone() public java.lang.Object
     * java.security.cert.CollectionCertStoreParameters.clone()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_clone()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.CollectionCertStoreParameters#getCollection() public
     * java.util.Collection java.security.cert.CollectionCertStoreParameters.getCollection()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCollection()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.CollectionCertStoreParameters#toString() public java.lang.String
     * java.security.cert.CollectionCertStoreParameters.toString()}.
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
