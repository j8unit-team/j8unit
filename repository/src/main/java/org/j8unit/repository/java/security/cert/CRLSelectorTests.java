package org.j8unit.repository.java.security.cert;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.security.cert.CRLSelector interface java.security.cert.CRLSelector}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.security.cert.CRLSelectorClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface CRLSelectorTests<SUT extends java.security.cert.CRLSelector>
extends org.j8unit.repository.java.lang.CloneableTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.cert.CRLSelector#clone() public abstract java.lang.Object
     * java.security.cert.CRLSelector.clone()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.security.cert.CRLSelector#match(java.security.cert.CRL) public abstract boolean
     * java.security.cert.CRLSelector.match(java.security.cert.CRL)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_match_CRL()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
