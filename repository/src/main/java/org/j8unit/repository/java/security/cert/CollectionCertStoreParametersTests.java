package org.j8unit.repository.java.security.cert;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.cert.CollectionCertStoreParameters class
 * java.security.cert.CollectionCertStoreParameters}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link CollectionCertStoreParametersClassTests}.
 * </p>
 *
 * @see java.security.cert.CollectionCertStoreParameters class java.security.cert.CollectionCertStoreParameters (the
 *      hereby targeted class-under-test class)
 * @see CollectionCertStoreParametersClassTests CollectionCertStoreParametersClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CollectionCertStoreParametersTests<SUT extends java.security.cert.CollectionCertStoreParameters>
extends CertStoreParametersTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.cert.CollectionCertStoreParameters#getCollection() public
     * java.util.Collection<?> java.security.cert.CollectionCertStoreParameters.getCollection()}.
     *
     * <p>
     * Test method for {@link java.security.cert.CollectionCertStoreParameters#getCollection() public
     * java.util.Collection java.security.cert.CollectionCertStoreParameters.getCollection()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.CollectionCertStoreParameters#getCollection() public java.util.Collection
     *      java.security.cert.CollectionCertStoreParameters.getCollection() (the hereby targeted method-under-test)
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
     * Test method for {@link java.security.cert.CollectionCertStoreParameters#clone() public java.lang.Object
     * java.security.cert.CollectionCertStoreParameters.clone()}.
     *
     * <p>
     * Test method for {@link java.security.cert.CollectionCertStoreParameters#clone() public java.lang.Object
     * java.security.cert.CollectionCertStoreParameters.clone()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.CollectionCertStoreParameters#clone() public java.lang.Object
     *      java.security.cert.CollectionCertStoreParameters.clone() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_clone()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.CollectionCertStoreParameters#toString() public java.lang.String
     * java.security.cert.CollectionCertStoreParameters.toString()}.
     *
     * <p>
     * Test method for {@link java.security.cert.CollectionCertStoreParameters#toString() public java.lang.String
     * java.security.cert.CollectionCertStoreParameters.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.CollectionCertStoreParameters#toString() public java.lang.String
     *      java.security.cert.CollectionCertStoreParameters.toString() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_toString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
